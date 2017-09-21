package com.weapes.mapper;

import com.weapes.domin.paper.Index;
import com.weapes.domin.paper.Paper;
import com.weapes.domin.paper.PaperMetrics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/25.
 */
@Mapper
@Service
public interface PaperMapper {
    @Select("select * from Paper where url=#{url}")
   Paper getPaperByUrl(@Param("url") String url);

    @Select("select * from PaperMetrics where url=#{url} order by updateTime desc limit 1")
   PaperMetrics getMetricsPaperByUrl(@Param("url")String url);

    @Select("select url from Paper")
    List<String> listPaperUrl();

    @Select("select url, updateTime, finalIndex from PaperMetrics where url=#{url} order by " +
            "updateTime limit 2")
    List<Index> listPaperMetricsIndexInfo(@Param("url") String url);

}
