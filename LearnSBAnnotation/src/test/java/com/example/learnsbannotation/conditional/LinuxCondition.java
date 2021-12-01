package com.example.learnsbannotation.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author liujd65
 * @date 2021/11/23 9:53
 **/
public class LinuxCondition implements Condition {


    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();

        String property = environment.getProperty("os.name");
        if (property.contains("Linux")){
            return true;
        }else {
            return false;
        }
    }
}
