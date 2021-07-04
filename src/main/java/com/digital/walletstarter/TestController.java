package com.digital.walletstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test2")
    public String testTwo(){
        return "Test2 m to from github ";
    }
    @GetMapping("/hello")
    public String testTwos(){
        return "Hello from Github";
    }
    @GetMapping("/hello2")
    public String testTwos2(){
        return "Hello method two is changed sdf ";
    }

    @GetMapping("/hello3")
    public String test3(){
        return "Hello  added ";
    }
    @GetMapping("/welcome")
    public String welcom(){
        return "Hello  welcome to DW ";
    }
    @GetMapping("/")
    public String test4(){
        return "Hello! Done  ";
    }


}
