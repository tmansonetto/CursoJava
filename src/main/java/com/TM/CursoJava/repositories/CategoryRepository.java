package com.TM.CursoJava.repositories;
import com.TM.CursoJava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
