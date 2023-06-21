package com.example.Coderz.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.Coderz.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

  Optional<User> findByUsername(String username);
}
