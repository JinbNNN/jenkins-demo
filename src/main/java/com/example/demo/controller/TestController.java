package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Author gaojba@dcits.com
 * @Date 2021/7/26 21:08
 * @Description
 * @Version 1.0
 **/
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
