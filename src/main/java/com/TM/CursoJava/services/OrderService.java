package com.TM.CursoJava.services;

import com.TM.CursoJava.entities.Order;
import com.TM.CursoJava.entities.User;
import com.TM.CursoJava.repositories.OrderRepository;
import com.TM.CursoJava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }
    public Order findById(Integer id) {
        Optional <Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
