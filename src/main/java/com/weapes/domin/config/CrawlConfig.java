package com.weapes.domin.config;

/**
 * Created by 不一样的天空 on 2017/6/25.
 */
public class CrawlConfig {
    private int startYear;
    private int endYear;
    private int taskPeriod;
    private int topNumber;
    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public int getTaskPeriod() {
        return taskPeriod;
    }

    public void setTaskPeriod(int taskPeriod) {
        this.taskPeriod = taskPeriod;
    }

    public int getTopNumber() {
        return topNumber;
    }

    public void setTopNumber(int topNumber) {
        this.topNumber = topNumber;
    }

    @Override
    public String toString() {
        return "CrawlConfig{" +
                "startYear=" + startYear +
                ", endYear=" + endYear +
                ", taskPeriod=" + taskPeriod +
                ", topNumber=" + topNumber +
                '}';
    }
}
