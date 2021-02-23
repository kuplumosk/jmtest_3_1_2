package com.kuplumosk.security.repositories;

import com.kuplumosk.security.entitys.Role;
import com.kuplumosk.security.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {


}
