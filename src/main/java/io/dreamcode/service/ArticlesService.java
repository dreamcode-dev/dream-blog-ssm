package io.dreamcode.service;


import io.dreamcode.pojo.Article;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticlesService {
    List<Article> getAll();
}
