package com.controller;

import com.pojo.User;
import com.utils.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/17.
 */
@Controller
@RequestMapping("/order")
public class OrdersController {
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addOrder(){
        ModelAndView modelAndView=new ModelAndView("forward:/rest/order/editor");
        return modelAndView;

    }
    @RequestMapping(value = "/editor", method = RequestMethod.GET)
    public ModelAndView editorOrder(){
        ModelAndView modelAndView =new ModelAndView("orderEditor");
        User user = new User();
        user.setAddr("1111");
        user.setCode("1111");
        user.setName("林");

        modelAndView.addObject("user",user);
        return modelAndView;

    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public JSONResult queryOrder(String id){
        JSONResult jsonResult = new JSONResult();
        User user = new User();
        user.setPhone(id);
        user.setAddr("1111");
        user.setCode("1111");
        user.setName("林");
        jsonResult.setData(user);
        jsonResult.setSuccess(true);
        return  jsonResult;
    }
}
