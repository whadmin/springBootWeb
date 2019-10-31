package com.wuhao.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication(scanBasePackages = "com.wuhao.springboot")
public class Bootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Bootstrap.class)
                .run(args);
        System.out.println(Arrays.toString(args));
        System.out.println(System.getenv("env_key"));
        System.out.println(System.getProperty("key"));
        System.out.println(context.getEnvironment().getProperty("env_key"));
        System.out.println(context.getEnvironment().getProperty("key"));
        System.out.println(context.getEnvironment().getProperty("nonOptionArgs"));
        System.out.println(context.getEnvironment().getProperty("key1"));
        System.out.println(context.getEnvironment().getProperty("key2"));
    }
}
