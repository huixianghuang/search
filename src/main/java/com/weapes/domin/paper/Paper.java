package com.weapes.domin.paper;

import java.util.List;

/**
 * Created by 不一样的天空 on 2017/6/25.
 */
public class Paper {
    private  String url;
    private  String title;
    private  String authors;
    private  String sourceTitle;
    private  String issn;
    private  String eissn;
    private  String doi;
    private  int volume;
    private  int issue;
    private  String pageBegin;
    private  String pageEnd;
    private  String affiliation;
    private  String publishTime;
    private  String crawlTime;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getSourceTitle() {
        return sourceTitle;
    }

    public void setSourceTitle(String sourceTitle) {
        this.sourceTitle = sourceTitle;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getEissn() {
        return eissn;
    }

    public void setEissn(String eissn) {
        this.eissn = eissn;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public String getPageBegin() {
        return pageBegin;
    }

    public void setPageBegin(String pageBegin) {
        this.pageBegin = pageBegin;
    }

    public String getPageEnd() {
        return pageEnd;
    }

    public void setPageEnd(String pageEnd) {
        this.pageEnd = pageEnd;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getCrawlTime() {
        return crawlTime;
    }

    public void setCrawlTime(String crawlTime) {
        this.crawlTime = crawlTime;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", sourceTitle='" + sourceTitle + '\'' +
                ", issn='" + issn + '\'' +
                ", eissn='" + eissn + '\'' +
                ", doi='" + doi + '\'' +
                ", volume=" + volume +
                ", issue=" + issue +
                ", pageBegin='" + pageBegin + '\'' +
                ", pageEnd='" + pageEnd + '\'' +
                ", affiliation='" + affiliation + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", crawlTime='" + crawlTime + '\'' +
                '}';
    }
}
