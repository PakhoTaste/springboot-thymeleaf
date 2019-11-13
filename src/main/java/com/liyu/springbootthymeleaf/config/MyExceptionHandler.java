package com.liyu.springbootthymeleaf.config;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request,Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("Exception" , e);
        mv.addObject("Url",request.getRequestURL());

        mv.setViewName("errorPage");
        return mv;
    }

}
