package com.sw.admin.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
* @Title: TestController
* @Package com.sw.admin.controller
* @Description: TODO
* @author yu.leilei
* @date 2018/10/29 11:21
* @version V1.0
*/
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "test")
    @ResponseBody
    public String test(){
        return "hello";
    }
}
