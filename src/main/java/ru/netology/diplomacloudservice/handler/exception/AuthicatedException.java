package ru.netology.diplomacloudservice.handler.exception;

public class AuthicatedException extends RuntimeException{
    public AuthicatedException(String message) {
        super(message);
    }
}