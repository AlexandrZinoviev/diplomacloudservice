package ru.netology.diplomacloudservice.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.diplomacloudservice.dto.ErrorResponse;
import ru.netology.diplomacloudservice.handler.exception.AuthicatedException;
import ru.netology.diplomacloudservice.handler.exception.FileException;
import ru.netology.diplomacloudservice.handler.exception.FileNotExistException;
import ru.netology.diplomacloudservice.handler.exception.MissingValueException;


import java.util.concurrent.atomic.AtomicInteger;

@RestControllerAdvice
public class RestControllerHandlers {
    private final AtomicInteger idErrorReponse = new AtomicInteger(1);

    @ExceptionHandler(AuthicatedException.class)
    public ResponseEntity<ErrorResponse> invalidCredentialsHandler(AuthicatedException e) {
        return new ResponseEntity<>(new ErrorResponse(e.getMessage(), idErrorReponse.getAndIncrement()),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(FileException.class)
    public ResponseEntity<ErrorResponse> invalidCredentialsHandler(FileException e) {
        return new ResponseEntity<>(new ErrorResponse(e.getMessage(), idErrorReponse.getAndIncrement()),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ErrorResponse> invalidCredentialsHandler(NullPointerException  e) {
        return new ResponseEntity<>(new ErrorResponse(e.getMessage(), idErrorReponse.getAndIncrement()),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MissingValueException.class)
    public ResponseEntity<ErrorResponse> invalidCredentialsHandler(MissingValueException e) {
        return new ResponseEntity<>(new ErrorResponse(e.getMessage(), idErrorReponse.getAndIncrement()),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(FileNotExistException.class)
    public ResponseEntity<ErrorResponse> invalidCredentialsHandler(FileNotExistException e) {
        return new ResponseEntity<>(new ErrorResponse(e.getMessage(), idErrorReponse.getAndIncrement()),
                HttpStatus.BAD_REQUEST);
    }

}