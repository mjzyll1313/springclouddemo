package com.mjz.yll.SpringcloudSevice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")//创建了熔断器的功能 并指定了fallbackMethod熔断方法，
    // 熔断方法直接返回了一个字符串，字符串为"hi,"+name+",sorry,error!"，

    public String hiService(String name) {
        return restTemplate.getForObject("http://server/hi?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }


}

