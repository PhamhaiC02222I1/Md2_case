package com.company.service.user;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.Login;
import com.company.model.User;
import com.company.service.ILoginGeneric;

import java.util.List;

public class UserServiceIMPL implements IUserGeneric<User> {
    public static String PATH = "C:\\Users\\ASUS\\Downloads\\MD2-Read-File-Generic-Multiple-master\\MD2-Read-File-Generic-Multiple-master\\src\\com\\company\\data\\register.txt";
     List<User> userList = new ConfigReadAndWriteFile<User>().readFromFile(PATH);


    @Override
    public List<User> findAll() {
        return userList;
    }

    @Override
    public void addUser(User user) {
userList.add(user);
new ConfigReadAndWriteFile<User>().writeToFile(PATH,userList);
    }
}
