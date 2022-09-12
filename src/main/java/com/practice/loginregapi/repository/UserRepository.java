package com.practice.loginregapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.loginregapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
	User findByEmail(String email);
}
