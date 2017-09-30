package com.raulhm.jwt.domain.entities.jwtparts;

import java.util.Date;
import java.util.UUID;

public class Payload {
  private static final int EXPIRATION_TIME_MILLISECONDS = 180000;
  private String iis;
  private String uid;
  private long iat;
  private long exp;
  private String jti;

  public String getIis() {
    return iis;
  }

  public String getUid() {
    return uid;
  }

  public long getIat() {
    return iat;
  }

  public long getExp() {
    return exp;
  }

  public String getJti() {
    return jti;
  }

  public Payload(String issuer, String uniqueId) {
    this.iis = issuer;
    this.uid = uniqueId;
    this.iat = new Date().getTime();
    this.exp = this.iat + EXPIRATION_TIME_MILLISECONDS;
    this.jti = UUID.randomUUID().toString();
  }
}
