package com.application.jpzp;

import com.application.jpzp.model.Product;
import com.application.jpzp.model.User;

import com.application.jpzp.service.ProductService;
import com.application.jpzp.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpzpApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpzpApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(ProductService productService) {
		return args -> {
			productService.save(new Product(1L, "TV Set", 500.00, "https://image.shutterstock.com/image-photo/4k-monitor-isolated-on-white-260nw-357968483.jpg"));
            productService.save(new Product(2L, "Switch", 300.00, "https://image.shutterstock.com/image-vector/video-game-console-gamepad-vector-260nw-1137618860.jpg"));
            productService.save(new Product(3L, "Monitor", 200.00, "https://image.shutterstock.com/image-photo/blank-computer-monitor-desk-clipping-260nw-98048864.jpg"));
            productService.save(new Product(4L, "Laptop", 350.00, "https://image.shutterstock.com/image-photo/laptop-blank-screen-on-table-260nw-340152863.jpg"));
            productService.save(new Product(5L, "Sunglasses", 50.00, "https://image.shutterstock.com/image-vector/realistic-vector-sunglasses-on-yellow-260nw-662770798.jpg"));
            productService.save(new Product(6L, "iPhone", 800.00, "https://image.shutterstock.com/image-vector/smartphone-iphone-style-gold-color-260nw-1541350247.jpg"));
            productService.save(new Product(7L, "Watch", 90.00, "https://image.shutterstock.com/image-photo/luxury-watch-isolated-on-white-260nw-1233640588.jpg"));
		};
	}
	
	@Bean
	CommandLineRunner runner2(UserService userService) {
		return args -> {
            userService.save(new User(1L, "Juan", "Zambrano", "wasd12", "jpzp95@gmail.com"));
		};
	}
	
}