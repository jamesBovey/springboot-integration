package com.zheng.integration.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wnb on 2018/4/13.
 */
@RestController
public class HelloController {

    @GetMapping("/test")
    public void test(){
        System.out.println("");
    }
}
