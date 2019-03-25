package com.sanayard.guava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmpController {
    @Autowired
    private UserService userService;

    @Autowired
    private CacheService cacheService;

    @RequestMapping("/index")
    public String index(){
        userService.test();
        return "hello";
    }
    @RequestMapping("/cacheRefresh")
    public String refresh(){
        cacheService.refresh();
        return "refresh cache ok";
    }
}
