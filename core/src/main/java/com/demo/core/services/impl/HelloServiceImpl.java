package com.demo.core.services.impl;

import com.demo.core.services.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "Hello from " + this.getClass().getCanonicalName();
    }
}
