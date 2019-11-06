package com.offcn.controller;

import com.offcn.dao.UserDao;
import com.offcn.entity.User;
import com.offcn.mapper.UserMapper;
import com.offcn.pojo.MUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;
    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> showUserList(){
        return userDao.findAll();
    }

    @RequestMapping(value = "/MList",method = RequestMethod.GET)
    public List<MUser> showMUserList(){
        return userMapper.getMUserList();
    }
}
