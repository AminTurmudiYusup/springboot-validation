package com.example.validation.services;

import com.example.validation.entity.User;
import com.example.validation.exception.ResourceAlreadyExistException;
import com.example.validation.exception.ResourceEmptyException;
import com.example.validation.exception.ResourceNotSatisfiable;
import com.example.validation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public void saveUser(User user) throws ResourceEmptyException, ResourceAlreadyExistException, ResourceNotSatisfiable {
        if(userRepository.existsUserByEmail(user.getEmail())){
        throw new ResourceAlreadyExistException("email already exist!");
        }
        if(userRepository.existsUserByPhone(user.getPhone())){
            throw new ResourceAlreadyExistException("phone number already exist!");
        }
        userRepository.save(user);
    }
}
