package com.test.api.testApp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyComponent implements CommandLineRunner {

    @Autowired
    private BaseConfig baseConfig;

    @Override
    public void run(String... args) throws Exception {
        // baseProperties 사용 예시
        System.out.println("property1: " + baseConfig.getProperty1());
        System.out.println("property2: " + baseConfig.getProperty2());
    }
}
