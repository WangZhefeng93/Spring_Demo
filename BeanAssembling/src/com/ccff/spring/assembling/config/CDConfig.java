package com.ccff.spring.assembling.config;

import com.ccff.spring.assembling.service.CompactDisc;
import com.ccff.spring.assembling.service.CompactDiscImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
    @Bean
    public CompactDisc compactDiscImpl(){
        return new CompactDiscImpl();
    }
}
