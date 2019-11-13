package com.liyu.springbootthymeleaf.service;

import com.liyu.springbootthymeleaf.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    void add(Category category);
    void update(Category category);
    void delete(String id);
    Category getOne(String id);
}
