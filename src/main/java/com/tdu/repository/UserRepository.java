package com.tdu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tdu.entity.User;

public interface UserRepository extends JpaRepository<User, String>, JpaSpecificationExecutor<User> {

}
