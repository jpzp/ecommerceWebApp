package com.application.jpzp.controller;

import com.application.jpzp.controller.OrderController.OrderForm;
import com.application.jpzp.dto.OrderProductDto;
import com.application.jpzp.exception.ResourceNotFoundException;
import com.application.jpzp.model.Order;
import com.application.jpzp.model.OrderProduct;
import com.application.jpzp.model.OrderStatus;
import com.application.jpzp.model.Product;
import com.application.jpzp.model.User;
import com.application.jpzp.service.ProductService;
import com.application.jpzp.service.UserService;

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
	
	private UserService userService;
	
	public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = { "", "/" })
    public @NotNull Iterable<User> getUsers() {
        return userService.getAllUsers();
    }
    
    /*
    @PostMapping
    public ResponseEntity<User> create(@RequestBody OrderForm form) {
        List<OrderProductDto> formDtos = form.getUser();
        validateProductsExistence(formDtos);
        User user = new User();
        user = this.userService.create(user);

        List<OrderProduct> orderProducts = new ArrayList<>();
        for (OrderProductDto dto : formDtos) {
            orderProducts.add(orderProductService.create(new OrderProduct(order, productService.getProduct(dto
              .getProduct()
              .getId()), dto.getQuantity())));
        }

        order.setOrderProducts(orderProducts);

        this.orderService.update(order);

        String uri = ServletUriComponentsBuilder
          .fromCurrentServletMapping()
          .path("/orders/{id}")
          .buildAndExpand(order.getId())
          .toString();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", uri);

        return new ResponseEntity<>(order, headers, HttpStatus.CREATED);
    }

    private void validateProductsExistence(List<OrderProductDto> orderProducts) {
        List<OrderProductDto> list = orderProducts
          .stream()
          .filter(op -> Objects.isNull(productService.getProduct(op
            .getProduct()
            .getId())))
          .collect(Collectors.toList());

        if (!CollectionUtils.isEmpty(list)) {
            new ResourceNotFoundException("Product not found");
        }
    }

    public static class UserForm {

        private List<UserDto> userOrders;

        public List<UserDto> getUsers() {
            return users;
        }

        public void setProductOrders(List<OrderProductDto> productOrders) {
            this.productOrders = productOrders;
        }
    }
    */
    
}
