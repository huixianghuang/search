package com.weapes.mapper;

import com.weapes.domin.config.CrawlConfig;
import com.weapes.domin.config.Weight;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

/**
 * Created by 不一样的天空 on 2017/6/25.
 */
@Mapper
@Service
public interface ConfigMapper {
    @Update("update Config set startYear=#{startYear},endYear=#{endYear}," +
            "taskPeriod=#{taskPeriod},topNumber=#{topNumber}")
    boolean modifyCrawlConfig(CrawlConfig crawlConfig);

    boolean modifyWeight(Weight weight);

    @Select("select topNumber from Config")
    int getTopNumber();

    @Select("select * from Config")
    CrawlConfig getCrawlConfig();
}
