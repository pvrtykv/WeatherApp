package com.github.pvrtykv.weather;

import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(FeignException.NotFound.class)
    protected ResponseEntity<Object> handleFeignError(FeignException.NotFound exc, WebRequest request) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("City not found");
    }
}
