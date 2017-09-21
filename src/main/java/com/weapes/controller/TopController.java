package com.weapes.controller;

import com.weapes.domin.paper.Index;
import com.weapes.domin.paper.Paper;
import com.weapes.service.ConfigService;
import com.weapes.service.IndexService;
import com.weapes.service.PaperService;
import com.weapes.util.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by 不一样的天空 on 2017/6/27.
 */
@RestController
@CrossOrigin
public class TopController {
    @Autowired
    PaperService paperService;
    @Autowired
    ConfigService configService;
    @Autowired
    IndexService indexService;
    @GetMapping("top")
    public List<Paper> listTopPaper(){
        int topNumber = configService.getTopNumber();
        List<String> paperUrls = paperService.listPaperUrl();
        HashMap<String,Double> hashMap = new HashMap<>();
        paperUrls.stream().forEach(paperUrl ->{
            String paperMetricsUrl = Helper.getPaperMetricsUrl(paperUrl);
            List<Index> indices = paperService.listPaperMetricsIndexInfo(paperMetricsUrl);
            if (indices.size() == 2){
                Double difference = indices.get(0).getFinalIndex()-indices.get(1).getFinalIndex();
                hashMap.put(paperUrl,Math.abs(difference));
            }else {
                hashMap.put(paperUrl,0.0);
            }
        });
        List<Paper> papers = new ArrayList<>();
        List<Map.Entry<String,Double>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list,(entity1,entity2) ->
             entity2.getValue().compareTo(entity1.getValue())
        );
        topNumber = topNumber > list.size() ? topNumber :list.size();
        for (int i = 0; i < topNumber; i++) {
            String url = list.get(i).getKey();
            Paper paper = paperService.getPaperByUrl(url);
            papers.add(paper);
        }
        return papers;
    }
}
