package com.company.view;

import java.util.Scanner;

public class Register {
    public Register(){
        System.out.println("1. register");
        System.out.println("2. login");
        System.out.println("Nhap lua chon");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                new  UserView().addUserList();
                break;
            case 2:
                new LoginView().login();
        }
    }

    public static void main(String[] args) {
       new Register();
    }

}
