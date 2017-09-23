package com.raulhm.jwt.domain.entities;

import com.raulhm.jwt.domain.entities.jwtparts.Header;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class JsonWebTokenTest {

  @Test
  public void hasAHeaderDefined() {
    assertNotNull(new Header("", ""));
  }
}
