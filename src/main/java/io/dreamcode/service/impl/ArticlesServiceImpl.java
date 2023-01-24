package io.dreamcode.service.impl;

import io.dreamcode.mapper.ArticlesMapper;
import io.dreamcode.pojo.Article;
import io.dreamcode.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("articlesService")
public class ArticlesServiceImpl implements ArticlesService {
    @Autowired
    private ArticlesMapper articlesMapper;
    @Override
    public List<Article> getAll() {
        return articlesMapper.getAll();
    }
}
