package com.wow.boot_gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/***
 *startup failed:
 Script1.groovy: 1: Unexpected character: '\' @ line 1, column 3.
 C:\Users\template.groovy
 ^

 1 error

 */
@SpringBootApplication
public class BootGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootGradleApplication.class, args);

    }


}
