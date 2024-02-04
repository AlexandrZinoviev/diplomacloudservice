package ru.netology.diplomacloudservice.handler.exception;

public class FileNotExistException extends RuntimeException{
    public FileNotExistException(String message) {
        super(message);
    }
}