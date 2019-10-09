package com.zlk.user.controller;

import com.zlk.user.entity.Pagination;
import com.zlk.user.entity.User;
import com.zlk.user.service.UserService;
import com.zlk.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @program: ssm
 * @description: 用户web层
 * @author: lth
 * @create: 2019-09-11 10:15
 **/
@Controller
@RequestMapping(value = "/user") //用来指定模块
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/toLogin")
    public String toLogin()throws Exception{//跳转登录页页面的方法
        return "login";
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest request, User user,String code)throws Exception{
        //首先获取验证码
        String checkCode = (String) request.getSession().getAttribute("checkCode");
        if(code.toLowerCase().equals(checkCode.toLowerCase())){
            //校验用户名和密码
            String md5Pwd = MD5Utils.md5Encrypt32Lower(user.getPwd());
            user.setPwd(md5Pwd);
            //调用service查询
            User loginUser = userService.findUserByNameAndPwd(user);
            if(null != loginUser){
                request.getSession().setAttribute("loginUser",loginUser);
                ModelAndView mv = new ModelAndView();
                mv.setViewName("redirect:/user/list");//登录成功之后跳转查询列表的方法
                return mv;
            }else{
                ModelAndView mv = new ModelAndView();
                mv.addObject("msg","用户名或密码错误");
                mv.setViewName("login");
                return mv;
            }
        }else {
            ModelAndView mv = new ModelAndView();
            mv.addObject("msg","验证码出错");
            mv.setViewName("login");
            return mv;
        }
    }
    @RequestMapping(value = "/list")
    public ModelAndView list(Pagination pagination)throws Exception{//列表查询
        Pagination pb = userService.findUserLimit(pagination);
        ModelAndView mv = new ModelAndView();
        mv.addObject("pb",pb);
        mv.setViewName("success");
        return mv;
    }
    @RequestMapping(value = "/toEdit/{uid}")
    public ModelAndView toEdit(@PathVariable("uid") String uid)throws Exception{//修改查询
        User user = userService.findUserById(uid);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("edit");
        return mv;
    }
    @RequestMapping(value = "/edit")
    public String edit(User user)throws Exception{
        user.setUpdateTime(new Date());
        Integer flag = userService.updateUserById(user);
        if(flag == 1){
            return "redirect:/user/list";
        }else {
            return null;
        }
    }
}
