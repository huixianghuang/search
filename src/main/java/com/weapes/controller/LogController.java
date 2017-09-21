package com.weapes.controller;

import com.weapes.domin.log.CrawlDetailLog;
import com.weapes.domin.log.CrawlTotalLog;
import com.weapes.domin.log.UpdateDetailLog;
import com.weapes.domin.log.UpdateTotalLog;
import com.weapes.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/24.
 */
@RestController
@RequestMapping("/logs")
@CrossOrigin
public class LogController {
    @Autowired
    LogService logService;
    @GetMapping("/crawl_detail")
    public List<CrawlDetailLog> listCrawlDetailLog(){
        return logService.listCrawlDetailLog();
    }
    @GetMapping("/crawl_total")
    public List<CrawlTotalLog> listCrawlTotalLog(){
        return logService.listCrawlTotalLog();
    }
    @GetMapping("/update_detail")
    public List<UpdateDetailLog> listUpdateDetailLog(){
        return logService.listUpdateDetailLog();
    }
    @GetMapping("/update_total")
    public List<UpdateTotalLog> listUpdateTotalLog(){
        return logService.listUpdateTotalLog();
    }
}
