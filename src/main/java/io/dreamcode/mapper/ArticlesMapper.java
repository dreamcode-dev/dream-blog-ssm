package io.dreamcode.mapper;

import io.dreamcode.pojo.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticlesMapper {
    List<Article> getAllArticles();

    Integer getAllArticlesCount();
}
