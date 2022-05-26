package com.week4.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeException {
  @ExceptionHandler(Throwable.class)
  public ResponseEntity handleRuntimeException() {
    return new ResponseEntity("Unexpected Exception", HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
