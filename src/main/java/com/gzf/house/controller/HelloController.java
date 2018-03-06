package com.gzf.house.controller;

import com.gzf.house.commonm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author gongzhifei
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(ModelMap modelMap){
        User user = new User();
        user.setName("武商");
        user.setId(1L);
        modelMap.put("user",user);
        return "hello";
    }

}
