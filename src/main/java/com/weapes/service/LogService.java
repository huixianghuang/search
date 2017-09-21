package com.weapes.service;


import com.weapes.domin.log.CrawlDetailLog;
import com.weapes.domin.log.CrawlTotalLog;
import com.weapes.domin.log.UpdateDetailLog;
import com.weapes.domin.log.UpdateTotalLog;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/24.
 */
@Service
public interface LogService {
    List<CrawlDetailLog> listCrawlDetailLog();
    List<CrawlTotalLog> listCrawlTotalLog();
    List<UpdateDetailLog> listUpdateDetailLog();
    List<UpdateTotalLog> listUpdateTotalLog();
}
