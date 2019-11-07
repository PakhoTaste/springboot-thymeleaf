package com.liyu.springbootthymeleaf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liyu.springbootthymeleaf.entity.Category;
import com.liyu.springbootthymeleaf.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @RequestMapping("/Category")
    public String CategoryList(Model m,@RequestParam(value = "start",defaultValue = "0") int start,@RequestParam(value = "size",defaultValue = "3")int size) throws  Exception{
        //在查询前记录需要传到页面的第几页，所以这行代码要在查询之前
        throw new Exception();
//        PageHelper.startPage(start,size,"id desc");
//        List<Category> categorys = categoryService.getAll();
//        m.addAttribute("cs",categorys);
//
//        PageInfo<Category> p = new PageInfo<>(categorys);
//        m.addAttribute("page",p);
//        return "CategoryView";
    }

    @RequestMapping("/add")
    public String add(){

        return "CategoryAdd";
    }

    @PostMapping("/Category")
    public String doAdd(Category category){
        categoryService.add(category);
        return "redirect:/Category";
    }

    @RequestMapping("/edit")
    public String edit(Model m ,String id){
        Category category = categoryService.getOne(id);
        m.addAttribute("c",category);

        return "CategoryEdit";
    }

    @RequestMapping("/update")
    public String update(Category category){
        categoryService.update(category);

        return "redirect:/Category";
    }

    @RequestMapping("/delete")
    public String delete(String id){
        categoryService.delete(id);

        return "redirect:/Category";
    }

}
