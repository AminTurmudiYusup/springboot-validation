package com.example.validation.controller;

import com.example.validation.dto.Registration;
import com.example.validation.exception.ResourceAlreadyExistException;
import com.example.validation.exception.ResourceEmptyException;
import com.example.validation.exception.ResourceNotSatisfiable;
import com.example.validation.services.RegistrationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationServices registrationServices;

    @PostMapping("/user/registration")
    public Registration userRegistration(@RequestBody @Valid Registration registration) throws ResourceEmptyException, ResourceAlreadyExistException, ResourceNotSatisfiable {
        registrationServices.registration(registration);
        return registration;
    }
}
