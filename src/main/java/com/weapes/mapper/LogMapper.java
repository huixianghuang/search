package com.weapes.mapper;


import com.weapes.domin.log.CrawlDetailLog;
import com.weapes.domin.log.CrawlTotalLog;
import com.weapes.domin.log.UpdateDetailLog;
import com.weapes.domin.log.UpdateTotalLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/24.
 */
@Mapper
@Service
public interface LogMapper {
    @Select("select * from CrawlDetailLog")
    List<CrawlDetailLog> listCrawlDetailLog();
    @Select("select * from CrawlTotalLog")
    List<CrawlTotalLog> listCrawlTotalLog();
    @Select("select * from UpdateDetailLog")
    List<UpdateDetailLog> listUpdateDetailLog();
    @Select("select * from UpdateTotalLog")
    List<UpdateTotalLog> listUpdateTotalLog();
}
