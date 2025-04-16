package com.cursor.learning.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan("com.cursor.learning")
@EntityScan("com.cursor.learning.domain.entity")
@MapperScan("com.cursor.learning.infrastructure.mapper")
public class SpringBootApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationStart.class, args);
    }
} 