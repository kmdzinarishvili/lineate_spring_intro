package com.exam.usershttpserver.config;

import com.exam.usershttpserver.repositories.UserRepository;
import com.exam.usershttpserver.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public UserService userService(UserRepository userRepository){
        return new UserService(userRepository);
    }
    @Bean
    public UserRepository userRepository(){
        return new UserRepository();
    }

}
