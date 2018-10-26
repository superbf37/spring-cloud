package org.superbf.cloud.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.superbf.cloud.dao.UserRepository;
import org.superbf.cloud.entity.User;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Resource
    private EurekaClient eurekaClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
       return userRepository.findOne(id);
    }
    @GetMapping("/eureka-instance")
    public String serviceUrl() {
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("MICROSERVICE-PROVIDE-USER", false);
        return instance.getHomePageUrl();
    }
    @GetMapping("/local-instance")
    public ServiceInstance getLocalServiceInstance(){
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        return instance;
    }


}
