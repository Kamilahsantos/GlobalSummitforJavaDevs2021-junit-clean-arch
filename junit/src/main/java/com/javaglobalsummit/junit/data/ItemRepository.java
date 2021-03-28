package com.javaglobalsummit.junit.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaglobalsummit.junit.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
}
