package io.dreamcode.service.impl;

import io.dreamcode.mapper.SiteInfoMapper;
import io.dreamcode.pojo.SiteInfo;
import io.dreamcode.service.SiteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SiteInfoServiceImpl implements SiteInfoService {
    @Autowired
    private SiteInfoMapper siteInfoMapper;

    @Override
    public SiteInfo getSiteInfo() {
        return siteInfoMapper.getSiteInfo();
    }
}
