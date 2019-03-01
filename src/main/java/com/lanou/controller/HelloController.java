package com.lanou.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloController implements Controller {
    @Override
        public ModelAndView handleRequest(HttpServletRequest Request, HttpServletResponse Response) throws Exception {
            ModelAndView modelAndView = new ModelAndView("Hello.jsp");
            return modelAndView;
    }
}
