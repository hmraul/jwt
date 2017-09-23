package com.raulhm.jwt.domain.entities.jwtparts;

public class Header {
  String typ;
  String alg;

  public Header(String typ, String alg) {
    this.typ = typ;
    this.alg = alg;
  }
}
