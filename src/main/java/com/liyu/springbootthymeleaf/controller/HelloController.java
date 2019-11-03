package com.liyu.springbootthymeleaf.controller;

import com.liyu.springbootthymeleaf.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("red","<p style='color:red'>红色文字</p>");
        m.addAttribute("name","张三");
        m.addAttribute("one",1);
        m.addAttribute("boolen",true);

        List<Product> ps = new ArrayList<>();
        ps.add(new Product(1,"product a", 50));
        ps.add(new Product(2,"product b", 100));
        ps.add(new Product(3,"product c", 150));
        ps.add(new Product(4,"product d", 200));
        ps.add(new Product(5,"product d", 300));
        ps.add(new Product(6,"product f", 200));
        ps.add(new Product(7,"product g", 200));

        m.addAttribute("id", 2);
        m.addAttribute("ps", ps);

        Date now = new Date();
        m.addAttribute("now", now);
        return  "hello";
    }
}
