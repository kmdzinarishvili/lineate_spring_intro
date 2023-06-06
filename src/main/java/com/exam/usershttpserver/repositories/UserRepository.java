package com.exam.usershttpserver.repositories;

import com.exam.usershttpserver.models.User;

import java.util.*;

public class UserRepository  {

     final Map<Long, User> userMap = new HashMap<>();

     public List<User> findAll(){
          return new ArrayList<>(userMap.values());
     }
     public void fill(){
          userMap.put(1L, new User(100L, "keti"));
          userMap.put(2L,new User(200L, "dato"));
          userMap.put(3L, new User(200L, "ika"));
     }

}