package org.superbf.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.superbf.cloud.entity.User;

import javax.annotation.Resource;

@RestController
public class MovieController {

   @Resource
    private RestTemplate restTemplate;
    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
//        http://microservice-provide-user/simple/1
//        VIP :virtual IP   虚拟IP 服务者提供的serviceID 就是spring.application.name
        return this.restTemplate.getForObject("http://microservice-provide-user/simple/1",User.class);
    }
}
