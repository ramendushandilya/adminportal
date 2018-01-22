package com.admin.service.impl;

import com.admin.domain.User;
import com.admin.domain.security.UserRole;
import com.admin.repository.RoleRepository;
import com.admin.repository.UserRepository;
import com.admin.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by failedOptimus on 20-01-2018.
 */

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User localUser = userRepository.findByUsername(user.getUsername());
        if(null != localUser) {
            LOG.info("user {} already exists. Nothing done", user.getUsername());
        } else {
            for(UserRole roles : userRoles) {
                roleRepository.save(roles.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            localUser = userRepository.save(user);
        }
        return localUser;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
