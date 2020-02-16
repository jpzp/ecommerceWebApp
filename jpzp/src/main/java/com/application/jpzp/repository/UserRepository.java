package com.application.jpzp.repository;

import com.application.jpzp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}