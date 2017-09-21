package com.weapes.controller;

import com.weapes.domin.form.SearchForm;
import com.weapes.domin.paper.Paper;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/27.
 */
@RestController
@CrossOrigin
public class SearchController {
    @Autowired
    TransportClient client;
    @PostMapping("search")
    public List<Paper> searchTitle(@RequestBody SearchForm searchForm){
        List<Paper> papers = new ArrayList<>();
        String title = searchForm.getKeyWord();
        int startYear = searchForm.getStartYear();
        int endYear = searchForm.getEndYear();
        SearchResponse searchResponse =client.prepareSearch("ntpaprseng")
                .setTypes("PAPER")                                                              //在索引中查询
                .setQuery(QueryBuilders.matchQuery("Title", title).fuzziness(3))  					//模糊搜索。等级为3
                .setPostFilter(QueryBuilders.rangeQuery("Year").from(startYear).to(endYear))      //年份查询
                .setSize(20)                                                                       //查询结果最多返回100个
                .execute().actionGet();
        SearchHit [] hits = searchResponse.getHits().getHits();
        for (int i = 0; i < hits.length; i++) {
            Paper paper = new Paper();
            paper.setUrl(hits[i].getSource().get("URL").toString());
            paper.setTitle(hits[i].getSource().get("Title").toString());
           papers.add(paper);
        }
        return papers;
    }
}
