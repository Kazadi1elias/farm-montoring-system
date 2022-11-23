package com.kazadi.farm.service;

import com.kazadi.farm.dao.UserRepository;
import com.kazadi.farm.model.Users;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImplementation implements UserService {


    @Autowired
    UserRepository userRepository;
    @Override
    public boolean saveUser(Users users) {
        try {
            Users saveUser = userRepository.save(users);

            if(saveUser != null){
                return true;
            }else {
                return  false;
            }

        }
        catch (Exception ex){

        }


        return false;

    }

    @Override
    public List<Users> getUsers() {
        return (List<Users>) userRepository.findAll();
    }
}
