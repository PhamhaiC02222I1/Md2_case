package com.company.model;

import java.io.Serializable;

public class Login extends User implements Serializable {
    public Login() {
    }

    public Login(String user, String password) {
        super(user, password);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
