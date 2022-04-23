package com.com.douglas.api.config;

import com.com.douglas.api.domain.User;
import com.com.douglas.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){

        User u1 = new User(null, "Douglas", "Douglas@gmail.com", "123");
        User u2 = new User(null, "Luiz", "Luiz@gmail.com", "321");

        repository.saveAll(List.of(u1, u2));
    }
}
