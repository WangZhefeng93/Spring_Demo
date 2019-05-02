package com.ccff.spring.assembling.config;

import com.ccff.spring.assembling.pojo.CDPlayer;
import com.ccff.spring.assembling.service.CompactDisc;
import com.ccff.spring.assembling.service.CompactDiscImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@Import(CDConfig.class)
@ImportResource("classpath:spring-config.xml")
public class CDPlayerConfig {
    /*@Bean
    public CompactDisc compactDiscImpl(){
        return new CompactDiscImpl();
    }*/

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
