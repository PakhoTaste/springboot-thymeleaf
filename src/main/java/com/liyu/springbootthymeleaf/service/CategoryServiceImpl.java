package com.liyu.springbootthymeleaf.service;

import com.liyu.springbootthymeleaf.entity.Category;
import com.liyu.springbootthymeleaf.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> getAll() {
        return categoryMapper.getAll();
    }

    @Override
    public void add(Category category) {
        categoryMapper.add(category);
    }

    @Override
    public void update(Category category) {
        categoryMapper.update(category);
    }

    @Override
    public void delete(String id) {
        categoryMapper.delete(id);
    }

    @Override
    public Category getOne(String id) {
        return  categoryMapper.getOne(id);
    }
}
