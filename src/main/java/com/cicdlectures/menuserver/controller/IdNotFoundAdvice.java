package com.cicdlectures.menuserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class IdNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(IdNotFound.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String IdNotFoundHandler(IdNotFound ex) {
    return ex.getMessage();
  }
}