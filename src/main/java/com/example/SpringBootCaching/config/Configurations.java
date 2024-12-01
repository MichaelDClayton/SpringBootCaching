package com.example.SpringBootCaching.config;

import com.example.SpringBootCaching.mybeans.Monitoring;
import com.example.SpringBootCaching.mybeans.TableOfContents;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;

@Configuration
public class Configurations {

    @Bean
    public TableOfContents tableOfContents() {
        return new TableOfContents();
    }

    @Bean
    public Monitoring monitoring() throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        return new Monitoring();
    }


}