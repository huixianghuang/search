package com.weapes.controller;

import com.weapes.service.ConfigService;
import com.weapes.domin.config.CrawlConfig;
import com.weapes.domin.config.Weight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 不一样的天空 on 2017/6/25.
 */
@RestController
@RequestMapping("/config")
@CrossOrigin
public class ModifyConfigController {
    @Autowired
    ConfigService configService;
    @PostMapping("/modify_crawl")
    public void modifyCrawlConfig(@RequestBody CrawlConfig crawlConfig){
        System.err.println(crawlConfig.toString());
         configService.modifyCrawlConfig(crawlConfig);
    }
    @PostMapping("/modify_weight")
    public void modifyWeight(@RequestBody Weight weight){
        configService.modifyWeight(weight);
    }
    @GetMapping("/crawl")
    public CrawlConfig getCrawlConfig(){
        return configService.getCrawlConfig();
    }
}
