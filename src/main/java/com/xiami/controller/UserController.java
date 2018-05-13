package com.xiami.controller;

import com.xiami.pojo.User;
import com.xiami.service.UserService;
import com.xiami.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    //@ResponseBody
    public String getUser(HttpServletRequest request) {
        List<User> users = userService.getUsers();
        request.setAttribute("users",users);
        return  "list";
     //   return  Msg.success().add("users",users);
    }
}
