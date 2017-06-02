package com.dubbo.controller;

import com.dubbo.provide.TestRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jiamin
 * @version $Id: TestController.java, v 0.1 2017/4/21 下午4:57 jiamin Exp $$
 */
@Controller
public class TestController {

    @Autowired
    private TestRegistryService testRegistryService;

    @RequestMapping(value = "/hello.json")
    public String index() {
        String name = testRegistryService.hello("zz");
        System.out.println("xx==" + name);
        return "";
    }
}
