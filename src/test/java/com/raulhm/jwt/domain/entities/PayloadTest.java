package com.raulhm.jwt.domain.entities;

import com.raulhm.jwt.domain.entities.jwtparts.Payload;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayloadTest {

  private static final String ISSUER = "Mozilla issuer";
  private static final String UNIQUE_ID = "uniqueId";
  private static final int EXPIRATION_TIME_MILLISECONDS = 180000;
  private static Payload payload;

  @BeforeClass
  public static void setUp() {
    payload = new Payload(ISSUER, UNIQUE_ID);
  }

  @Test
  public void setIssuer() {
    assertEquals(ISSUER, payload.getIis());
  }

  @Test
  public void setUniqueId() {
    assertEquals(UNIQUE_ID, payload.getUid());
  }

  @Test
  public void defineThirtyMinutesExpiration() {
    assertEquals(EXPIRATION_TIME_MILLISECONDS, payload.getExp() - payload.getIat());
  }

}
