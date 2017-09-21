package com.weapes.service;

import com.weapes.domin.config.CrawlConfig;
import com.weapes.domin.config.Weight;

/**
 * Created by 不一样的天空 on 2017/6/25.
 */
public interface ConfigService {
    boolean modifyCrawlConfig(CrawlConfig crawlConfig);
    boolean modifyWeight(Weight weight);
    int getTopNumber();
    CrawlConfig getCrawlConfig();
}
