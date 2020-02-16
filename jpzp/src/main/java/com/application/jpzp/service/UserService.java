package com.application.jpzp.service;

import com.application.jpzp.model.Order;
import com.application.jpzp.model.User;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Validated
public interface UserService{

    @NotNull Iterable<User> getAllUsers();

    User getUser(@Min(value = 1L, message = "Invalid user ID.") long id);

    User save(User user);
	
    User create(@NotNull(message = "The order cannot be null.") @Valid User user);
    
}