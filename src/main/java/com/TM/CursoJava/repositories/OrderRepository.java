package com.TM.CursoJava.repositories;

import com.TM.CursoJava.entities.Order;
import com.TM.CursoJava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {


}
