package com.programacaoweb.aulapratica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programacaoweb.aulapratica.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
