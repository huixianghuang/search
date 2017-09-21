package com.weapes.domin.paper;

import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/26.
 */
public class PaperDetail {
    private Paper paper;
    private PaperMetrics paperMetrics;
    private List<Index> indices;

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public PaperMetrics getPaperMetrics() {
        return paperMetrics;
    }

    public void setPaperMetrics(PaperMetrics paperMetrics) {
        this.paperMetrics = paperMetrics;
    }

    public List<Index> getIndices() {
        return indices;
    }

    public void setIndices(List<Index> indices) {
        this.indices = indices;
    }

    @Override
    public String toString() {
        return "PaperDetail{" +
                "paper=" + paper +
                ", paperMetrics=" + paperMetrics +
                ", indices=" + indices +
                '}';
    }
}
