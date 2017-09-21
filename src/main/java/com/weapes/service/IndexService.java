package com.weapes.service;

import com.weapes.domin.paper.Index;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/26.
 */
public interface IndexService {

    List<Index> listIndexByUrl(String url);
    List<Index> listIndexByUrlAndTimeRange( String url,
                                            String begin,
                                            String end);
}
