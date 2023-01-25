package io.dreamcode.pojo;

import java.util.Date;

public class Article {
    private Integer id;
    private String title;
    private String content;
    private String markdown;
    private String categoryId;
    private String tagId;
    private Date postTime;
    private Date updateTime;

    public Article() {
    }

    public Article(Integer id, String title, String content, String markdown, String categoryId, String tagId, Date postTime, Date updateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.markdown = markdown;
        this.categoryId = categoryId;
        this.tagId = tagId;
        this.postTime = postTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", markdown='" + markdown + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", tagId='" + tagId + '\'' +
                ", postTime=" + postTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
