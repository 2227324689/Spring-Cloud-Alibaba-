package com.gupaoedu.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
public class GpCondition implements Condition{

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //此处进行条件判断，如果返回true，表示需要加载该配置类或者Bean
        //否则，表示加载
        String os=conditionContext.getEnvironment().getProperty("os.name");
        if(os.contains("Linux")){
            return true;
        }
        return false;
    }
}
