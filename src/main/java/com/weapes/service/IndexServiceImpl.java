package com.weapes.service;

import com.weapes.domin.paper.Index;
import com.weapes.mapper.IndexMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/26.
 */
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    IndexMapper indexMapper;
    @Override
    public List<Index> listIndexByUrl(String url) {
        return indexMapper.listIndexByUrl(url);
    }

    @Override
    public List<Index> listIndexByUrlAndTimeRange(String url, String begin, String end) {
        return indexMapper.listIndexByUrlAndTimeRange(url,begin,end);
    }
}
