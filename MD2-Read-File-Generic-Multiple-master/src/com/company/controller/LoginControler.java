package com.company.controller;

import com.company.model.Login;
import com.company.service.Login.LoginServiceIMPL;

public class LoginControler {
    LoginServiceIMPL loginServiceIMPL=new LoginServiceIMPL();
    public boolean login(Login login){
        return loginServiceIMPL.login(login);
    }
}
