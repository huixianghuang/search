package com.weapes.controller;

import com.weapes.domin.paper.PaperDetail;
import com.weapes.service.IndexService;
import com.weapes.service.PaperService;
import com.weapes.util.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 不一样的天空 on 2017/6/25.
 */
@RestController
@CrossOrigin
public class PaperDetailController {
    @Autowired
    PaperService paperService;
    @Autowired
    IndexService indexService;
    @GetMapping("/paper_detail")
    public PaperDetail getPaperDetail(@RequestParam("url") String url){
        PaperDetail paperDetail = new PaperDetail();
        System.err.println("--------------paperUrl"+url);
        String paperMetricsUrl = Helper.getPaperMetricsUrl(url);
        System.err.println("--------------paperMetricsUrl"+paperMetricsUrl);
        paperDetail.setPaper(paperService.getPaperByUrl(url));
        System.err.println("------------+"+paperService.getPaperByUrl(url));
        paperDetail.setPaperMetrics(paperService.getMetricsPaperByUrl(paperMetricsUrl));
        System.err.println("------------+"+paperService.getMetricsPaperByUrl(paperMetricsUrl));
        paperDetail.setIndices(indexService.listIndexByUrl(paperMetricsUrl));
        System.out.println("-------------"+indexService.listIndexByUrl(paperMetricsUrl));
        System.out.println(paperDetail.toString());
        return paperDetail;
    }
}
