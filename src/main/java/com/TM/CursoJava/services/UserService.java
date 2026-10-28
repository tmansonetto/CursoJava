package com.TM.CursoJava.services;

import com.TM.CursoJava.entities.User;
import com.TM.CursoJava.repositories.UserRepository;
import com.TM.CursoJava.resources.exceptions.DatabaseException;
import com.TM.CursoJava.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User findById(Integer id) {
        Optional <User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user) {
        return userRepository.save(user);
    }


    public void delete(Integer id) {
        try {
            userRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Integer id, User user) {
        try {
            User entity = userRepository.getReferenceById(id);
            updateData(entity, user);
            return userRepository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
         throw new DatabaseException(e.getMessage());
        }
    }
    private void updateData(User entity, User user) {
        entity.setUsername(user.getUsername());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }
}
