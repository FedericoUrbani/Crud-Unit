package com.develhope.testUnit;

import org.springframework.stereotype.Service;

@Service
public class UserFakeService {

    public User returnUserWithId(){
        return new User(1,"Federico","Urbani");
    }

    public User deleteUserWithId(){
        User usernull=null;
        return usernull;
    }

    public User updateUser(){
        return new User(1,"Jonny", "Jonnino");
    }

    public User createUser(String name, String surname){
        return new User(1,name,surname);
    }

}
