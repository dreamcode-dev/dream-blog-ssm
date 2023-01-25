package io.dreamcode.controller.home;

import io.dreamcode.pojo.Article;
import io.dreamcode.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ArticlesController {
    @Autowired
    private ArticlesService articlesService;

    @RequestMapping("/getAllArticlesCount")
    public Integer getAllArticlesCount() {
        return articlesService.getAllArticlesCount();
    }

}
