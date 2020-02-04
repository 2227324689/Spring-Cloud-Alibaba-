package com.gupaoedu.springboot.demo.demo03;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
public class GpImportSelector implements ImportSelector{
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //返回的数据是需要被Ioc容器装载的类
        return new String[]{TestService.class.getName()};
    }
}
