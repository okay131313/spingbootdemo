package com.roy.Testcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestController {
    @RequestMapping("add.do")
    public String add(){
        return "addok";
}}
