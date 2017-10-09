package Controller;

import Bean.User;
import Service.UserService;
import Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /*登录功能实现*/
    @RequestMapping(value = "/login")
    public String login(User user, HttpServletResponse response){
        System.out.println("前台提交的数据："+user);
        response.setCharacterEncoding("UTF-8");
            String password= user.getPassword();
            User u = userService.findPwdByUsername(user.getUsername());
            if (u.getPassword().equals(password)){
                return "redirect:/manage/manage.jsp";
               }
               return "redirect:/login/login.jsp";
            }

    /*主页面预加载用户信息*//*
    @ResponseBody
    @RequestMapping(value = "/loadUser")
    public User loadUser(){
        User userInf = userService.findUserInf();
        System.out.println("主页返回用户信息："+userInf);
        return userInf;
    }*/



}

