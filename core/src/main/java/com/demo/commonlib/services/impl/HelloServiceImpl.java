package com.demo.commonlib.services.impl;

import com.demo.commonlib.services.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "Hello from " + this.getClass().getCanonicalName();
    }
}
