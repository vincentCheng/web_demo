package com.example.web_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author vincentCheng
 * @create 2020-02-29-8:01
 */
@Controller
@ResponseBody
public class MyController {
    @Autowired
    MySvc mySvc;

    @GetMapping("/")
    public String index() {
        return "hello spring boot Jenkinsfile";
    }

    @GetMapping("/add")
    public String add(int a, int b) {
        return mySvc.add(a, b) + "";
    }
}
