package com.company.view;

import com.company.controller.LoginControler;
import com.company.model.Login;

import java.util.Scanner;

public class LoginView {
    LoginControler loginControler=new LoginControler();
    Scanner scanner=new Scanner(System.in);
    public void login(){
        System.out.println("Enter Name:");
        String name=scanner.nextLine();
        System.out.println("Enter password:");
        String password=scanner.nextLine();
        Login login=new Login(name,password);

        if (loginControler.login(login)) {
            if (login.getUser().equals("admin")&&login.getPassword().equals("admin")){
                new Main();
            }else {
                new Main1();
            }


        }else System.out.println("Nhap lai thong tin!!!");
        new Register();
    }
}
