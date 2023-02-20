package com.example.ManagementSystem.service;

import com.example.ManagementSystem.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static List<User> user=new ArrayList<>();
    private static int userCount=0;
    static {
        user.add(new User(++userCount,"Vaishnavi","VaishB","Hyderabad","23548981215"));
        user.add(new User(++userCount,"sony","sony123","Delhi","6954289685"));
        user.add(new User(++userCount,"Geetha","geetha","Kolkata","52688981215"));
        user.add(new User(++userCount,"Jeevan","J1","kerala","2854885215"));
        user.add(new User(++userCount,"Harsh","HarshB","Warangal","36984981215"));
        user.add(new User(++userCount,"Yamini","Yaam","ahmadabad","9381881215"));
    }
    public List<User> getAllUser(){
        return user;
    }
    public User getById(int userId) {

        for (int i = 0; i < user.size(); i++) {
            User u = user.get(i);
            if (userId == u.getUserId()) {
                return u;
            }
        }
        return null;
    }
    public void addUser(User user1) {
        user.add(user1);
    }
    public void deleteUser(int userId) {
        for (int i = 0; i < user.size(); i++) {
            User u = user.get(i);
            if (userId == u.getUserId()) {
                user.remove(u);
            }
        }

    }
        public void updateUserInfo(int userId, User user1){
        User u=getById(userId);
        u.setName(user1.getName());
        u.setUserName(user1.getUserName());
        u.setAddress(user1.getAddress());
        u.setNumber(user1.getNumber());
    }


}
