package com.company.service.Login;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.Login;
import com.company.model.User;


import java.util.List;


public class LoginServiceIMPL implements ILoginServiceIMPL<Login> {
    private String path = "C:\\Users\\ASUS\\Downloads\\MD2-Read-File-Generic-Multiple-master\\MD2-Read-File-Generic-Multiple-master\\src\\com\\company\\data\\register.txt";
    private List<User> userList = new ConfigReadAndWriteFile<User>().readFromFile(path);


    @Override
    public boolean login(Login login) {
        boolean check = false;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUser().equals(login.getUser()) && userList.get(i).getPassword().equals(login.getPassword())) {

                check = true;
            }
        }
        return check;
    }
}
