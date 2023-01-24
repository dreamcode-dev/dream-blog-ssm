package io.dreamcode.controller;

import io.dreamcode.pojo.SiteInfo;
import io.dreamcode.service.SiteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiteInfoController {
    @Autowired
    private SiteInfoService siteInfoService;

    @RequestMapping("/siteInfo")
    public SiteInfo getSiteInfo() {
        return siteInfoService.getSiteInfo();
    }

}
