package org.example.springbootdemo.controller;

import org.example.springbootdemo.model.Order;
import org.example.springbootdemo.respository.OrderRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderRepository  repo;

    public OrderController(OrderRepository repo){
        this.repo = repo;
    }

    @PostMapping
    public String addOrder(@RequestBody Order order){
        repo.save(order);
        return "done";
    }

}
