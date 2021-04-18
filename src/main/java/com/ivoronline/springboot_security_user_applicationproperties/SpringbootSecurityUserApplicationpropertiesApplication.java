package com.ivoronline.springboot_security_user_applicationproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SpringbootSecurityUserApplicationpropertiesApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootSecurityUserApplicationpropertiesApplication.class, args);
  }

}
