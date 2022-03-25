package com.example.autoconfigure;

import com.example.Service.LogProperties;
import com.example.Service.LogService;
import com.example.Service.LogServiceImp;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(LogService.class)
@EnableConfigurationProperties(LogProperties.class)
public class LoggerAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public  LogService logService(){
        return new LogServiceImp();
    }

}
