package com.dubbo.provide.service.impl;

import com.dubbo.provide.TestRegistryService;
import org.springframework.stereotype.Service;

/**
 * @author jiamin
 * @version $Id: TestRegistryServiceImpl.java, v 0.1 2017/4/21 上午10:59 jiamin Exp $$
 */
@Service("testRegistryService")
public class TestRegistryServiceImpl implements TestRegistryService {
    public String hello(String name) {
        return "hello" + name;
    }
}
