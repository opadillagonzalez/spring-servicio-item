package com.springapp.item.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springapp.item.models.Item;
import com.springapp.item.models.Producto;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private RestTemplate clientRest;
	
	
	private String url = "http://localhost:8082";
	private String findAll = "/v1/listar";
	private String findById = "/v1/ver/{id}";

	@Override
	public List<Item> findAll() {
		List<Producto> productos = Arrays.asList(clientRest.getForObject(url + findAll, Producto[].class));
		
		return productos.stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, int cantidad) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		
		Producto product = clientRest.getForObject(url + findById, Producto.class, pathVariables);
		
		return new Item(product, cantidad);
	} 

}
