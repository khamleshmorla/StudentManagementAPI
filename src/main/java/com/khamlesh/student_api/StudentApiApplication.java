package com.khamlesh.student_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class StudentApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(StudentApiApplication.class, args);
    }

}