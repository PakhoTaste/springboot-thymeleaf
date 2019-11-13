package com.liyu.springbootthymeleaf.service;

import com.liyu.springbootthymeleaf.entity.Hero;

import java.util.List;

public interface HeroService {
    public int add(Hero hero);

    public void delete(int id);

    public Hero get(int id);

    public int update(Hero hero);

    public List<Hero> list();
}
