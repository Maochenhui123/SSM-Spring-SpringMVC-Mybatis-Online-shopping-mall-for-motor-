package com.maoc.exception.resolver;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e){
        RuntimeException exception = null;
        if(e instanceof RuntimeException){
            exception = (RuntimeException) e;
        }else{
            exception = new RuntimeException("系统正在维护");
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("error",exception.getMessage());
        mv.setViewName("500.jsp");
        return mv;
    }
}
