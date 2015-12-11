package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.UserVO;

public interface UserRepository extends JpaRepository <UserVO, Integer> {
}