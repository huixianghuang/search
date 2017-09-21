package com.weapes.domin.log;

/**
 * Created by 不一样的天空 on 2017/6/24.
 */
public class CrawlDetailLog {
   private String url;
   private int articlePosition;
   private int totalNumber;
   private int isSuccessful;
   private String crawlTime;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getArticlePosition() {
        return articlePosition;
    }

    public void setArticlePosition(int articlePosition) {
        this.articlePosition = articlePosition;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public int getIsSuccessful() {
        return isSuccessful;
    }

    public void setIsSuccessful(int isSuccessful) {
        this.isSuccessful = isSuccessful;
    }

    public String getCrawlTime() {
        return crawlTime;
    }

    public void setCrawlTime(String crawlTime) {
        this.crawlTime = crawlTime;
    }

    @Override
    public String toString() {
        return "CrawlDetailLog{" +
                "url='" + url + '\'' +
                ", articlePosition=" + articlePosition +
                ", totalNumber=" + totalNumber +
                ", isSuccessful=" + isSuccessful +
                ", crawlTime='" + crawlTime + '\'' +
                '}';
    }
}
