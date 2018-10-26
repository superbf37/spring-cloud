package org.superbf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MicroserviceEurekaApplication {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(MicroserviceEurekaApplication.class).web(true).run(args);
        SpringApplication.run(MicroserviceEurekaApplication.class,args);
    }
}
