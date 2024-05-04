package com.programacaoweb.aulapratica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.programacaoweb.aulapratica.entities.User;

@Service
public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    User insert(User user);

    void delete(Long id);

    User update(Long id, User user);
}
