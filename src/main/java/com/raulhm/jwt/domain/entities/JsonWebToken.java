package com.raulhm.jwt.domain.entities;

import com.raulhm.jwt.domain.entities.jwtparts.Header;
import com.raulhm.jwt.domain.entities.jwtparts.Payload;
import com.raulhm.jwt.domain.entities.jwtparts.Signature;

public class JsonWebToken {
  private Header header;
  private Payload payLoad;
  private Signature signature;

  public JsonWebToken(Header header, Payload payload) {
    this.header = header;
    this.payLoad = payload;
    this.signature = new Signature();
  }

  public Header getHeader() {
    return header;
  }

  public Payload getPayLoad() {
    return payLoad;
  }

  public Signature getSignature() {
    return signature;
  }
}
