package com.example.validation.exception;

public class ResourceEmptyException extends RuntimeException{
    public ResourceEmptyException(String message){
        super(message);
    }
}
