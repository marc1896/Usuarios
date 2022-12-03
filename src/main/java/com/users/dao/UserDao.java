package com.users.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.users.domain.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
