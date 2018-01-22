package com.admin.repository;

import com.admin.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by failedOptimus on 20-01-2018.
 */

public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByName(String name);

}
