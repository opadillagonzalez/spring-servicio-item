package com.springapp.item.service;

import java.util.List;

import com.springapp.item.models.Item;

public interface ItemService {
	
	public List<Item> findAll();
	
	public Item findById(Long id, int cantidad);

}
