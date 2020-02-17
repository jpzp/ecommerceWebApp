package com.application.jpzp.service;

import com.application.jpzp.model.User;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Validated
public interface UserService{

    User findByEmail(String email);

    User save(User user);
	
    User findByConfirmationToken(String confirmationToken);
    
}