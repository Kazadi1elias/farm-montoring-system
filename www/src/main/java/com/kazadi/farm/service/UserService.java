package com.kazadi.farm.service;

import com.kazadi.farm.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    boolean saveUser(Users users);

    List<Users> getUsers();


}
