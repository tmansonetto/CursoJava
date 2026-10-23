package com.TM.CursoJava.repositories;

import com.TM.CursoJava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


}
