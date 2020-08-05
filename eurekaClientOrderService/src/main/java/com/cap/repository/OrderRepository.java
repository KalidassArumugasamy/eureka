package com.cap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
