package io.dreamcode.service;


import io.dreamcode.pojo.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface ArticlesService {
    List<Article> getAllArticles();

    Integer getAllArticlesCount();

    List<Article> pageArticles(Integer pageIndex);

    // 分页数据
    Map<String, Object> pageData(Integer pageIndex);

    Article getArticleById(Integer articleId);
}
