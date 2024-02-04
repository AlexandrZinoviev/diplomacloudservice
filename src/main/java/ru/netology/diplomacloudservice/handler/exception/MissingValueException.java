package ru.netology.diplomacloudservice.handler.exception;

public class MissingValueException extends RuntimeException{
    public MissingValueException(String message) {
        super(message);
    }
}