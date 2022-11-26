package com.farm1.farm1.Repositories;

import com.farm1.farm1.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
