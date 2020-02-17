package com.application.jpzp.service;

import com.application.jpzp.exception.ResourceNotFoundException;
import com.application.jpzp.model.Order;
import com.application.jpzp.model.User;
import com.application.jpzp.repository.UserRepository;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
		
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

    @Override
    public User findByConfirmationToken(String confirmationToken) {
		return userRepository.findByConfirmationToken(confirmationToken);
	}

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
