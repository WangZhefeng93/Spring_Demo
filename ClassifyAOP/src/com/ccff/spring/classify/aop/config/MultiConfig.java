package com.ccff.spring.classify.aop.config;

import com.ccff.spring.classify.aop.aspect.Aspect1;
import com.ccff.spring.classify.aop.aspect.Aspect2;
import com.ccff.spring.classify.aop.aspect.Aspect3;
import com.ccff.spring.classify.aop.multi.MultiBean;
import com.ccff.spring.classify.aop.multi.MultiBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.ccff.spring.classify.aop")
public class MultiConfig {

    @Bean
    public MultiBean multiBean(){
        return new MultiBeanImpl();
    }

    @Bean
    public Aspect1 aspect1(){
        return new Aspect1();
    }

    @Bean
    public Aspect2 aspect2(){
        return new Aspect2();
    }

    @Bean
    public Aspect3 aspect3(){
        return new Aspect3();
    }

}
