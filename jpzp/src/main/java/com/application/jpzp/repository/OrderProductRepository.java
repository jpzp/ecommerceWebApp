package com.application.jpzp.repository;

import com.application.jpzp.model.OrderProduct;
import com.application.jpzp.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}