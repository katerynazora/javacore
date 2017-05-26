package com.zora.runners.lesson17;

import com.zora.app.classwork.lesson17.User;

/**
 * Created by Kateryna Zora  on 16.05.2017.
 */
public class UserRunner {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(10);
        user.setName("KIT");
        user.setPassport("UKR");

        User user2 = new User();
        user2.setAge(10);
        user2.setName("KIT2");
        user2.setPassport("UKR");

        System.out.println(user.equals(user2));
    }
}
