package com.tt.sb.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.tt.sb.model.User;

@Service("us")
public interface UserService extends JpaRepository<User, Long> {

}
