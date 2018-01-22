package com.admin.service;

import com.admin.domain.User;
import com.admin.domain.security.UserRole;

import java.util.Set;

/**
 * Created by failedOptimus on 20-01-2018.
 */
public interface UserService {

    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);

}
