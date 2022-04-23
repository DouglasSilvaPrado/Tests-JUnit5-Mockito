package com.com.douglas.api.services;

import com.com.douglas.api.domain.User;
import com.com.douglas.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO obj);
}
