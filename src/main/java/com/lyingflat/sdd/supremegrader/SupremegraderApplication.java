package com.lyingflat.sdd.supremegrader;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * the entrance of the program
 */
@SpringBootApplication
@MapperScan("com.lyingflat.sdd.supremegrader.dao")
public class SupremegraderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupremegraderApplication.class, args);
    }
}
