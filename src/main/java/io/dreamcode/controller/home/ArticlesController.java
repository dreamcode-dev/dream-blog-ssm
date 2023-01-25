package io.dreamcode.controller.home;

import cn.hutool.core.io.file.FileReader;
import io.dreamcode.pojo.Article;
import io.dreamcode.service.ArticlesService;
import io.dreamcode.service.SiteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.io.FileNotFoundException;


@Controller
@RequestMapping("/articles")
public class ArticlesController {
    @Autowired
    private ArticlesService articlesService;
    @Autowired
    private SiteInfoService siteInfoService;

    @RequestMapping("/getAllArticlesCount")
    public Integer getAllArticlesCount() {
        return articlesService.getAllArticlesCount();
    }

    @RequestMapping("/{articleId}")
    public String toArticleDetailPage(@PathVariable Integer articleId, HttpServletRequest request) throws FileNotFoundException {
        Article article = articlesService.getArticleById(articleId);
        String classPath = ResourceUtils.getURL("classpath:").getPath();
        String rootPath = classPath.substring(0, classPath.indexOf("out"));
        String fullPath = rootPath + "category/" + article.getCategoryId() + "/" + article.getMarkdown() + ".md";

        request.setAttribute("article", article);
        request.setAttribute("siteInfo", siteInfoService.getSiteInfo());
        request.setAttribute("markdownText", new FileReader(fullPath).readString());
        return "home/articleDetail";
    }

}
