package com.weapes.service;


import com.weapes.domin.log.CrawlDetailLog;
import com.weapes.domin.log.CrawlTotalLog;
import com.weapes.domin.log.UpdateDetailLog;
import com.weapes.domin.log.UpdateTotalLog;
import com.weapes.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/24.
 */
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    LogMapper logMapper;
    @Override
    public List<CrawlDetailLog> listCrawlDetailLog() {
        return logMapper.listCrawlDetailLog();
    }

    @Override
    public List<CrawlTotalLog> listCrawlTotalLog() {
        return logMapper.listCrawlTotalLog();
    }

    @Override
    public List<UpdateDetailLog> listUpdateDetailLog() {
        return logMapper.listUpdateDetailLog();
    }

    @Override
    public List<UpdateTotalLog> listUpdateTotalLog() {
        return logMapper.listUpdateTotalLog();
    }
}
