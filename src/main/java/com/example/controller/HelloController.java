package com.example.controller;/**
 * @title: HelloController
 * @projectName jenkins-demo
 * @description:
 * @author HuangJian
 * @date 2020-05-10
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@description:
 *@author: huangJian
 *@create: 2020-05-10
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello wolrd";
    }

    @RequestMapping("/day")
    public String day(){
        return "母亲节快乐！！！";
    }
}
