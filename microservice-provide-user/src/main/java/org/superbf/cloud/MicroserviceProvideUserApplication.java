package org.superbf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceProvideUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProvideUserApplication.class, args);
    }
}
