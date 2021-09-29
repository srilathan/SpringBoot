package com.test.spring.jpa.postgresql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.spring.jpa.postgresql.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
  List<Order> findByPublished(boolean published);

  List<Order> findByTitleContaining(String title);
}
