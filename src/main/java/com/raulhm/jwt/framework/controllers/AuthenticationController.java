package com.raulhm.jwt.framework.controllers;

import com.raulhm.jwt.domain.entities.JsonWebToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
public class AuthenticationController {

  @RequestMapping(value = "/token", method = RequestMethod.POST)
  public JsonWebToken createToken(String user, String password) {
    return null;
  }
}
