package com.fyle.banks.api.exceptionhandler;


import static org.springframework.http.HttpStatus.BAD_REQUEST;

import com.fyle.banks.exception.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
@Slf4j
public class ApiExceptionHandler extends ResponseEntityExceptionHandler
{

  @ExceptionHandler(ApiException.class)
  protected ResponseEntity<Object> handleRestHttpExceptions(ApiException ex) {
    return buildResponseEntity(new ApiError(BAD_REQUEST, BAD_REQUEST.getReasonPhrase(), ex));
  }

  private static ResponseEntity<Object> buildResponseEntity(final ApiError apiError)
  {
    return new ResponseEntity<>(apiError, apiError.getStatus());
  }

}
