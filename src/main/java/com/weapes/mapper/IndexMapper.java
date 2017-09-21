package com.weapes.mapper;

import com.weapes.domin.paper.Index;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/26.
 */
@Service
@Mapper
public interface IndexMapper {
    @Select("select url,updateTime,finalIndex from PaperMetrics where url=#{url}")
    List<Index> listIndexByUrl(@Param("url") String url);
    @Select("select url,updateTime,finalIndex from PaperMetrics where url=#{url}" +
            " and updateTime between #{begin} and #{end}")
    List<Index> listIndexByUrlAndTimeRange(@Param("url") String url,
                                           @Param("begin") String begin,
                                           @Param("end") String end);
}
