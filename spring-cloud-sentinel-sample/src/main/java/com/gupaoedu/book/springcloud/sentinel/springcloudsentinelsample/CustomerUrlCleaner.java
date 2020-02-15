package com.gupaoedu.book.springcloud.sentinel.springcloudsentinelsample;

import com.alibaba.csp.sentinel.adapter.servlet.callback.UrlCleaner;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Service
public class CustomerUrlCleaner implements UrlCleaner{
    @Override
    public String clean(String originUrl) {
        if(StringUtils.isEmpty(originUrl)){
            return originUrl;
        }
        if(originUrl.startsWith("/clean/")){
            return "/clean/*";
        }
        return originUrl;
    }
}
