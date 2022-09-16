package com.example.validation.exception;

public class ResourceAlreadyExistException extends RuntimeException{
    public ResourceAlreadyExistException(String message){
        super(message);
    }
}
