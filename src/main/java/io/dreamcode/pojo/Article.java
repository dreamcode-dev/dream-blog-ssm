package io.dreamcode.pojo;

import java.util.Date;

public class Article {
    private Integer id;
    private String title;
    private String content;
    private String markdown;
    private String categoryIds;
    private String tagIds;
    private Date postTime;
    private Date updateTime;

    public Article() {
    }

    public Article(Integer id, String title, String content, String markdown, String categoryIds, String tagIds, Date postTime, Date updateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.markdown = markdown;
        this.categoryIds = categoryIds;
        this.tagIds = tagIds;
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

    public String getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getTagIds() {
        return tagIds;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
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
                ", categoryIds='" + categoryIds + '\'' +
                ", tagIds='" + tagIds + '\'' +
                ", postTime=" + postTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
