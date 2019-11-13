package com.liyu.springbootthymeleaf.mapper;

import com.liyu.springbootthymeleaf.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CategoryMapper {
    public List<Category> getAll();
    public void add(Category category);
    public void update(Category category);
    public void delete(String id);
    public Category getOne(String id);
}
