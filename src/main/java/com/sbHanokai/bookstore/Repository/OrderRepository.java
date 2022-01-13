package com.sbHanokai.bookstore.Repository;

import com.sbHanokai.bookstore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
