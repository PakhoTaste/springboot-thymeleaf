package com.liyu.springbootthymeleaf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liyu.springbootthymeleaf.entity.Hero;
import com.liyu.springbootthymeleaf.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class HeroController {
    @Autowired HeroService heroService;

    /*restful 部分*/
    @GetMapping("/heros")
    public PageInfo<Hero> list(@RequestParam(value = "start", defaultValue = "1") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        PageHelper.startPage(start,size,"id desc");
        List<Hero> hs=heroService.list();
        //5表示导航分页最多有5个，像 [1,2,3,4,5] 这样
        PageInfo<Hero> page = new PageInfo<>(hs,5);
        return page;
    }

    @GetMapping("/heros/{id}")
    public Hero get(@PathVariable("id") int id) throws Exception {
        System.out.println(id);
        Hero h=heroService.get(id);
        System.out.println(h);
        return h;
    }

    @PostMapping("/heros")
    public String add(@RequestBody Hero h) throws Exception {
        heroService.add(h);
        return "success";
    }
    @DeleteMapping("/heros/{id}")
    public String delete(Hero h) throws Exception {
        heroService.delete(h.getId());
        return "success";
    }
    @PutMapping("/heros/{id}")
    public String update(@RequestBody Hero h) throws Exception {
        heroService.update(h);
        return "success";
    }
    @RequestMapping(value="/listHero", method= RequestMethod.GET)
    public ModelAndView listHero(){

        ModelAndView mv = new ModelAndView("listHero");
        return mv;
    }

    @RequestMapping(value="/editHero", method=RequestMethod.GET)
    public ModelAndView editHero(){
        ModelAndView mv = new ModelAndView("editHero");
        return mv;
    }

    @GetMapping("/hero1")
    public Hero get(){
        Hero h = new Hero();
        h.setId(7777);
        h.setName("rizi");
        h.setHp(56);
        return  h;
    }

}
