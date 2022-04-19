package com.company.controller;

import com.company.model.Login;
import com.company.model.User;
import com.company.service.user.UserServiceIMPL;

import java.util.List;

public class UserController {
   private UserServiceIMPL userServiceIMPL= new UserServiceIMPL();
   public List<User> showListUser(){
       return userServiceIMPL.findAll();
   }
    public void addListUser(User user){
        userServiceIMPL.addUser(user);
    }
}
