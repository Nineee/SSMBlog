package Controller;

import Bean.User;
import Service.UserService;
import Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login")
    public String login(User user, HttpServletResponse response){
        System.out.println(user);
        response.setCharacterEncoding("UTF-8");
            String password= user.getPassword();
            User u = userService.findPwdByUsername(user.getUsername());
            if (u.getPassword().equals(password)){
                    return "redirect:/index.jsp";
               }
               return "redirect:/index.jsp";
            }
    }

