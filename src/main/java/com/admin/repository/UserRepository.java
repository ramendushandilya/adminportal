package com.admin.repository;

import com.admin.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by failedOptimus on 20-01-2018.
 */
public interface UserRepository extends CrudRepository<User, Long>{

    User findByUsername(String username);

}
