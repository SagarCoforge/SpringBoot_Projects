package com.loginreg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loginreg.entity.User;

@Repository
public interface LoginRepo extends JpaRepository<User, String>   {

}
