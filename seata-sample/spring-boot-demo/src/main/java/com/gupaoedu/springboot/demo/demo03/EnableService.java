package com.gupaoedu.springboot.demo.demo03;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(GpImportSelector.class)
public @interface EnableService {


}
