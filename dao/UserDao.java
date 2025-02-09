package com.airline.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airline.entity.User;
@Repository
public interface UserDao extends JpaRepository<User, Long> {
	
	User findByUserName(String userName);

}
