package com.weapes.domin.paper;

/**
 * Created by 不一样的天空 on 2017/6/25.
 */
public class Index {
    private String url;
    private String updateTime;
    private Double finalIndex;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Double getFinalIndex() {
        return finalIndex;
    }

    public void setFinalIndex(Double finalIndex) {
        this.finalIndex = finalIndex;
    }

    @Override
    public String toString() {
        return "Index{" +
                "url='" + url + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", finalIndex=" + finalIndex +
                '}';
    }
}
