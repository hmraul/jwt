package com.raulhm.jwt.domain.entities;

import com.raulhm.jwt.domain.entities.jwtparts.Header;
import com.raulhm.jwt.domain.entities.jwtparts.Payload;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class JsonWebTokenTest {

  private static JsonWebToken token;

  @BeforeClass
  public static void setUp() {
    token = new JsonWebToken(
        new Header("JWT", "HS256"),
        new Payload());
  }

  @Test
  public void hasAHeaderDefined() {
    assertNotNull(token.getHeader());
  }

  @Test
  public void hasAPayLoadDefined() {
    assertNotNull(token.getPayLoad());
  }

  @Test
  public void hasASignatureDefined() {
    assertNotNull(token.getSignature());
  }
}
