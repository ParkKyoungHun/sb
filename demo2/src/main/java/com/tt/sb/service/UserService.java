package com.tt.sb.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tt.sb.model.User;

public interface UserService extends JpaRepository<User, Long> {

}
