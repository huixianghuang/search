package com.weapes.domin.log;

/**
 * Created by 不一样的天空 on 2017/6/24.
 */
public class CrawlTotalLog {
    private String crawlTime;
    private int successfulNumber;
    private int failedNumber;
    private int totalNumber;
    private String averageTime;

    public String getCrawlTime() {
        return crawlTime;
    }

    public void setCrawlTime(String crawlTime) {
        this.crawlTime = crawlTime;
    }

    public int getSuccessfulNumber() {
        return successfulNumber;
    }

    public void setSuccessfulNumber(int successfulNumber) {
        this.successfulNumber = successfulNumber;
    }

    public int getFailedNumber() {
        return failedNumber;
    }

    public void setFailedNumber(int failedNumber) {
        this.failedNumber = failedNumber;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public String getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(String averageTime) {
        this.averageTime = averageTime;
    }

    @Override
    public String toString() {
        return "CrawlTotalLog{" +
                "crawlTime='" + crawlTime + '\'' +
                ", successfulNumber=" + successfulNumber +
                ", failedNumber=" + failedNumber +
                ", totalNumber=" + totalNumber +
                ", averageTime='" + averageTime + '\'' +
                '}';
    }
}
