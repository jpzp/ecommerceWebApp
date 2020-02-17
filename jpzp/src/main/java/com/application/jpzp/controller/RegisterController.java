package com.application.jpzp.controller;

import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.application.jpzp.model.User;
import com.application.jpzp.service.UserService;

@RestController
@RequestMapping("/api/register")
public class RegisterController {
	private UserService userService;
	
	@Autowired
	public RegisterController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public ModelAndView showRegistrationPage(ModelAndView modelAndView, User user){
		modelAndView.addObject("user", user);
		modelAndView.setViewName("register");
		return modelAndView;
	}
	
	
	// Process form input data
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView processRegistrationForm(ModelAndView modelAndView, @Valid User user, BindingResult bindingResult, HttpServletRequest request) {
					
		// Lookup user in database by e-mail
		User userExists = userService.findByEmail(user.getEmail());
			
		System.out.println(userExists);
			
		if (userExists != null) {
			modelAndView.addObject("alreadyRegisteredMessage", "Oops!  There is already a user registered with the email provided.");
			modelAndView.setViewName("register");
			bindingResult.reject("email");
		}
				
		if (bindingResult.hasErrors()) { 
			modelAndView.setViewName("register");		
		} else { // new user so we create user
		    user.setEnabled(true);
			      
		        
		    userService.save(user);
					
			String appUrl = request.getScheme() + "://" + request.getServerName();
				
			modelAndView.addObject("confirmationMessage", "User has been created");
			modelAndView.setViewName("register");
		}
				
		return modelAndView;
	}
			
	
	
}
