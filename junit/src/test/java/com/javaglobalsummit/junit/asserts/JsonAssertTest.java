package com.javaglobalsummit.junit.asserts;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

  String actualResponse = "{\"id\":4,\"name\":\"spring\",\"price\":0,\"quantity\":100}";

  @Test
  public void jsonAssert_StrictTrue_ExactMatchExceptForSpaces() throws JSONException {
    String expectedResponse = "{\"id\": 4, \"name\":\"spring\", \"price\":0, \"quantity\":100}";
    JSONAssert.assertEquals(expectedResponse, actualResponse, true);
  }

  @Test
  public void jsonAssert_StrictFalse() throws JSONException {
    String expectedResponse = "{\"id\": 4, \"name\":\"spring\", \"price\":0}";
    JSONAssert.assertEquals(expectedResponse, actualResponse, false);
  }

  @Test
  public void jsonAssert_WithoutEscapeCharacters() throws JSONException {
    String expectedResponse = "{id:4, name:spring, price:0}";
    JSONAssert.assertEquals(expectedResponse, actualResponse, false);
  }

}
