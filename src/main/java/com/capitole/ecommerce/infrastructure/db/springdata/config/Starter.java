package com.capitole.ecommerce.infrastructure.db.springdata.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.capitole.*")
@EntityScan(basePackages = "com.capitole.*")
public class Starter {

  public static void main(String[] args) {
    SpringApplication.run(Starter.class, args);
  }

}