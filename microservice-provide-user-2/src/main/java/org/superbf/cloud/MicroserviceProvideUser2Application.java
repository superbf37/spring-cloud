package org.superbf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceProvideUser2Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProvideUser2Application.class, args);
    }
}
