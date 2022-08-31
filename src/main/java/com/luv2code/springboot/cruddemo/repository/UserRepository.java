package com.luv2code.springboot.cruddemo.repository;

import com.luv2code.springboot.cruddemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
