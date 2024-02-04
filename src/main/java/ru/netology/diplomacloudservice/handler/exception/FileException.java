package ru.netology.diplomacloudservice.handler.exception;

public class FileException extends RuntimeException {
    public FileException(String message) {
        super(message);
    }
}