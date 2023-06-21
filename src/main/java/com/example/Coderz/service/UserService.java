package com.example.Coderz.service;

import com.example.Coderz.entity.User;

public interface UserService {
  User getUser(Long id);
  User getUser(String username);
  User saveUser(User user);
}
