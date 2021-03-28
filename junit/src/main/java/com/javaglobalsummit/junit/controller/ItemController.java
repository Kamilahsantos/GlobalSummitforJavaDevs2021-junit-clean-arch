package com.javaglobalsummit.junit.controller;

import java.util.List;

import com.javaglobalsummit.junit.business.ItemBusinessService;
import com.javaglobalsummit.junit.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

  @Autowired
  private ItemBusinessService businessService;

  @GetMapping("/dummy-item")
  public Item dummyItem() {
    return new Item(1, "globalsummit", 0, 100);
  }

  @GetMapping("/item-from-service")
  public Item itemFromBusinessService() {
    Item item = businessService.retreiveHardcodedItem();

    return item;
  }

  @GetMapping("/all-items-database")
  public List<Item> retrieveAllItems() {
    return businessService.retrieveAllItems();
  }

}
