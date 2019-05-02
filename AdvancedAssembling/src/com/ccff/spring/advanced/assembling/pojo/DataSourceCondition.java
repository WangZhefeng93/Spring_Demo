package com.ccff.spring.advanced.assembling.pojo;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DataSourceCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获取上下文环境
        Environment environment = conditionContext.getEnvironment();
        //判断是否存在关于数据源的基础配置
        return environment.containsProperty("jdbc.database.driver")
                && environment.containsProperty("jdbc.database.url")
                && environment.containsProperty("jdbc.database.username")
                && environment.containsProperty("jdbc.database.password");
    }
}
