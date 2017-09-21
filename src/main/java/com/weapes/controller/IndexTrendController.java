package com.weapes.controller;

import com.weapes.domin.form.IndexTrendForm;
import com.weapes.domin.paper.Index;
import com.weapes.service.IndexService;
import com.weapes.util.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/26.
 */
@RestController
@CrossOrigin
public class IndexTrendController {
    @Autowired
    IndexService indexService;
    @PostMapping("final_index_trend")
    public List<Index> getMetricsPaperIndexTrend(@RequestBody IndexTrendForm indexTrendForm){
        String paperMetricsUrl = Helper.getPaperMetricsUrl(indexTrendForm.getUrl());
        String startMonth = indexTrendForm.getStartMonth();
        String endMonth = indexTrendForm.getEndMonth();
        if (Integer.parseInt(startMonth)<10){
            startMonth ="0"+startMonth;
        }
        if (Integer.parseInt(endMonth)<10){
            endMonth ="0"+endMonth;
        }
        String begin = indexTrendForm.getStartYear()+"年"+startMonth+"月01日";
        String end = indexTrendForm.getStartYear()+"年"+endMonth+"月31日";
        return indexService.listIndexByUrlAndTimeRange(paperMetricsUrl,begin,end);
    }

}
