package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id) {
        return orderRepository.getById(id);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.getAll();
    }

    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        return orderRepository.add(order);
    }
}
