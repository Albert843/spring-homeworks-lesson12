package com.gb;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(LoggingProperties.class)
public class HttpLoggingAutoConfiguration {

    @Bean
    LoggerFilter loggerFilter(LoggingProperties loggingProperties) {
        return new LoggerFilter(loggingProperties);
    }
}

