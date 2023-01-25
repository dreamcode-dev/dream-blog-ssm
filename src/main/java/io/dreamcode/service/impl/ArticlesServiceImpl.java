package io.dreamcode.service.impl;

import com.github.pagehelper.PageHelper;
import io.dreamcode.mapper.ArticlesMapper;
import io.dreamcode.pojo.Article;
import io.dreamcode.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("articlesService")
public class ArticlesServiceImpl implements ArticlesService {
    private static final Integer PAGE_SIZE = 5;
    @Autowired
    private ArticlesMapper articlesMapper;

    @Override
    public List<Article> getAllArticles() {
        return articlesMapper.getAllArticles();
    }

    @Override
    public Integer getAllArticlesCount() {
        return articlesMapper.getAllArticlesCount();
    }

    @Override
    public List<Article> pageArticles(Integer pageIndex) {
        PageHelper.offsetPage(pageIndex, PAGE_SIZE);
        List<Article> allArticles = articlesMapper.getAllArticles();
        return allArticles;
    }

    @Override
    public Map<String, Object> pageData(Integer pageIndex) {
        HashMap<String, Object> pageData = new HashMap<>();
        pageData.put("currPage", pageIndex); // 当前第几页
        PageHelper.offsetPage(pageIndex * 5, 5);
        pageData.put("articleData", articlesMapper.getAllArticles());
        return pageData;
    }

    @Override
    public Article getArticleById(Integer articleId) {
        return articlesMapper.getArticleById(articleId);
    }

}
