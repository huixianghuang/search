package com.weapes.service;

import com.weapes.domin.config.CrawlConfig;
import com.weapes.domin.config.Weight;
import com.weapes.mapper.ConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 不一样的天空 on 2017/6/25.
 */
@Service
public class ConfigServiceImpl implements ConfigService{

    @Autowired
    ConfigMapper configMapper;
    @Override
    public boolean modifyCrawlConfig(CrawlConfig crawlConfig) {
        return configMapper.modifyCrawlConfig(crawlConfig);
    }

    @Override
    public boolean modifyWeight(Weight weight) {
        return configMapper.modifyWeight(weight);
    }

    @Override
    public int getTopNumber() {
        return configMapper.getTopNumber();
    }

    @Override
    public CrawlConfig getCrawlConfig() {
        return configMapper.getCrawlConfig();
    }
}
