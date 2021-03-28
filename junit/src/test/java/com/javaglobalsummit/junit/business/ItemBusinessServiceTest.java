package com.javaglobalsummit.junit.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import com.javaglobalsummit.junit.data.ItemRepository;
import com.javaglobalsummit.junit.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ItemBusinessServiceTest {

  @InjectMocks
  private ItemBusinessService business;

  @Mock
  private ItemRepository repository;

  @Test
  public void retrieveAllItems_basic() {
    when(repository.findAll()).thenReturn(Arrays.asList(new Item(2,"Item2",15,10),
      new Item(3,"Item3",25,20)));
    List<Item> items = business.retrieveAllItems();

    assertEquals(150, items.get(0).getValue());
    assertEquals(500, items.get(1).getValue());
  }

}
