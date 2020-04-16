package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@RestController
public class IndexController {

    @Autowired
    DataSource dataSource;

    @GetMapping("/index")
    public String index(){


       return "xx";
    }
}
