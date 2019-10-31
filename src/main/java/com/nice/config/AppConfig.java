package com.nice.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ningh
 */
@Configuration
@ComponentScan(basePackages = "com.nice.*", lazyInit = true)
public class AppConfig {
}
