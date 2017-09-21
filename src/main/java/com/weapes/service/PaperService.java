package com.weapes.service;

import com.weapes.domin.paper.Index;
import com.weapes.domin.paper.Paper;
import com.weapes.domin.paper.PaperMetrics;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/26.
 */
public interface PaperService {

    Paper getPaperByUrl(@Param("url") String url);

    PaperMetrics getMetricsPaperByUrl(@Param("url")String url);

    List<String> listPaperUrl();

    List<Index> listPaperMetricsIndexInfo(@Param("url") String url);

}
