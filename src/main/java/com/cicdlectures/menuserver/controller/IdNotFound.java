package com.cicdlectures.menuserver.controller;

class IdNotFound extends RuntimeException {
  IdNotFound(Long id) {
    super("Could not find id " + id);
  }
}