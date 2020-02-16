package com.application.jpzp.service;

import com.application.jpzp.exception.ResourceNotFoundException;
import com.application.jpzp.model.Order;
import com.application.jpzp.model.User;
import com.application.jpzp.repository.UserRepository;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
		
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
    public Iterable<User> getAllUsers() {
        return this.userRepository.findAll();
    }
	
	@Override
	public User getUser(long id) {
		return userRepository
		          .findById(id)
		          .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
	}

    @Override
    public User create(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
