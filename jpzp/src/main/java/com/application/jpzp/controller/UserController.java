package com.application.jpzp.controller;

import com.application.jpzp.model.User;
import com.application.jpzp.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = { "", "/" })
    public @NotNull User findByEmail(String email) {
        return userService.findByEmail(email);
    }
    
    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        user = this.userService.save(user);

        String uri = ServletUriComponentsBuilder
          .fromCurrentServletMapping()
          .path("/users/{id}")
          .buildAndExpand(user.getId())
          .toString();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", uri);

        return new ResponseEntity<>(user, headers, HttpStatus.CREATED);
    }
    
}
