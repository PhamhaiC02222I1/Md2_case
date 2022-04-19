package com.company.view;

import com.company.controller.UserController;
import com.company.model.User;
import com.company.service.user.UserServiceIMPL;

import java.util.List;
import java.util.Scanner;

public class UserView {
    Scanner scanner=new Scanner(System.in);
    UserController userController=new UserController();
    public void showListUser(){
        userController.showListUser();
        System.out.println("Ấn q để quit");
        String quit = scanner.nextLine();
        switch (quit){
            case "q":
                new Main();
                break;
            default:
                break;
        }
    }
    public void addUserList(){
        while (true){
            System.out.println("enter username: ");
            String username = scanner.nextLine();
            System.out.println("enter password: ");
            String password = scanner.nextLine();
            User user = new User(username,password);
            userController.addListUser(user);
            System.out.println("ấn t để tiếp tục: ");
            System.out.println("ấn q để thoát: ");
            String quit = scanner.nextLine();
            switch (quit){
                case "t":
                    addUserList();
                    break;
                case "q":
                    new Register();
                    break;
            }
        }
    }
}
