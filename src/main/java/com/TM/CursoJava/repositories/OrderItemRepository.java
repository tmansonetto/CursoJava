package com.TM.CursoJava.repositories;

import com.TM.CursoJava.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderItemRepository  extends JpaRepository<OrderItem,Integer>,JpaSpecificationExecutor<OrderItem>{
}
