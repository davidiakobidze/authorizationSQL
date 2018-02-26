package com.authorizationSQL.authorizationSQL.repository;

import com.authorizationSQL.authorizationSQL.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {


    Users findByName(String name);
}
