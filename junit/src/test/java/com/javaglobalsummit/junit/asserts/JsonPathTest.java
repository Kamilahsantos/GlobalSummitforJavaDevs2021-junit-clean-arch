package com.javaglobalsummit.junit.asserts;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JsonPathTest {

  @Test
  public void learning() {
    String responseFromService = "[" +
      "{\"id\":1, \"name\":\"java\", \"quantity\":100}," +
      "{\"id\":2, \"name\":\"global\", \"quantity\":100}," +
      "{\"id\":3, \"name\":\"summit\", \"quantity\":100}" +
      "]";

    DocumentContext context = JsonPath.parse(responseFromService);

    int length = context.read("$.length()");
    assertThat(length).isEqualTo(3);

    List<Integer> ids = context.read("$..id");

    assertThat(ids).containsExactly(1,2,3);

    System.out.println(context.read("$.[1]").toString());
    System.out.println(context.read("$.[0:2]").toString());
    System.out.println(context.read("$.[?(@.name=='global')]").toString());
    System.out.println(context.read("$.[?(@.quantity==100)]").toString());

  }

}
