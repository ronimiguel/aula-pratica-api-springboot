package com.programacaoweb.aulapratica.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.programacaoweb.aulapratica.service.exceptions.ResourceNotFoundException;

import java.util.Date;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError error = new StandardError(new Date(), status.value(), "Not Found", e.getMessage(), "");
        return ResponseEntity.status(status).body(error);
    }
}
