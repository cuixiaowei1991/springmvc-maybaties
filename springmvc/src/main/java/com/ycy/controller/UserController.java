package com.ycy.controller;

import com.ycy.model.*;
import com.ycy.service.Roleservice;
import com.ycy.service.UserTest;
import com.ycy.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by cuixiaowei on 2016/10/26 0015.
 */
@Controller
/*@RequestMapping("/user")*/
public class UserController {
    @Autowired
    private Userservice userService;
    @Autowired
    private UserTest userTest;
    @Autowired
    private Roleservice roleservice;
    /*@ResponseBody*/
    @RequestMapping("/getuser")
    public UserAccount getUserByUserId(HttpServletRequest request ){

        System.out.println("进入---------------------");
        UserAccount u = userService.getUserAccountById(new Long("1"));
        System.out.println("例子================" + u.getName());

        user uu= userTest.getUserById(2);
        System.out.println("例子222222222================" + uu.getName());
        Role role=new Role();
        role.setRoleIsManager("1");
        int aa=roleservice.insertRole(role);
        System.out.println("例子insert================" + aa);

        user entity=new user();
        entity.setName("111");

        user uu_name= userTest.getUserByName(entity);
        System.out.println("例子33333name================" + uu_name.getAge());


        request.setAttribute("user", u);
        return u;
    }
}
