package com.TM.CursoJava.services;

import com.TM.CursoJava.entities.User;
import com.TM.CursoJava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return obj.get();
    }

    public User insert(User user) {
        return userRepository.save(user);
    }
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}
