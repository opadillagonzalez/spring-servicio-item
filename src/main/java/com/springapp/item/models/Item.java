package com.springapp.item.models;

public class Item {

	private Producto product;
	private int cantidad;

	public Item() {
	}

	public Item(Producto product, int cantidad) {
		this.product = product;
		this.cantidad = cantidad;
	}

	public Producto getProduct() {
		return product;
	}

	public void setProduct(Producto product) {
		this.product = product;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public Double getTotal() {
		return product.getPrice() * cantidad;
	}

}
