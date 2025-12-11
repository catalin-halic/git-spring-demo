package com.endava.gitspringdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestControllerDemo {

    public String getMessage1() {
        return "Message 1";
    }

    public String getMessage2() {
        return "Message 2";
    }

    public String getMessage3() {
        return "Message 3";
    }

    public String getMessage4() {
        return "Message 4";
    }

    public String getMessage5(){return "Message 5";}
}
