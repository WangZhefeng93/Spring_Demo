package com.ccff.spring.assembling.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CDPlayerConfig.class,CDConfig.class})
public class SoundSystemConfig {
}
