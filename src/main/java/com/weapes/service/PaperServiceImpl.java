package com.weapes.service;

import com.weapes.domin.paper.Index;
import com.weapes.domin.paper.Paper;
import com.weapes.domin.paper.PaperMetrics;
import com.weapes.mapper.PaperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/26.
 */
@Service
public class PaperServiceImpl implements PaperService {
    @Autowired
    PaperMapper paperMapper;
    @Override
    public Paper getPaperByUrl(String url) {
        return paperMapper.getPaperByUrl(url);
    }

    @Override
    public PaperMetrics getMetricsPaperByUrl(String url) {
        return paperMapper.getMetricsPaperByUrl(url);
    }

    @Override
    public List<String> listPaperUrl() {
        return paperMapper.listPaperUrl();
    }

    @Override
    public List<Index> listPaperMetricsIndexInfo(String url) {
        return paperMapper.listPaperMetricsIndexInfo(url);
    }

}
