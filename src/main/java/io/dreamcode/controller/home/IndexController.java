package io.dreamcode.controller.home;

import com.github.pagehelper.PageHelper;
import io.dreamcode.pojo.Article;
import io.dreamcode.service.ArticlesService;
import io.dreamcode.service.SiteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    private SiteInfoService siteInfoService;
    @Autowired
    private ArticlesService articlesService;

    @RequestMapping("/")
    public String toIndex(HttpServletRequest request) {
        request.setAttribute("siteInfo", siteInfoService.getSiteInfo());
        request.setAttribute("allArticlesCount", articlesService.getAllArticlesCount());
        // 分页数据，初始化显示第一页，每页五条数据
        request.setAttribute("articles", articlesService.pageArticles(0));
        request.setAttribute("pageData", articlesService.pageData(1));
        return "home/index";
    }

    @RequestMapping("/page/{pageIndex}")
    public Map<String, Object> pageData(@PathVariable Integer pageIndex) {
        return articlesService.pageData(pageIndex);
    }

}
