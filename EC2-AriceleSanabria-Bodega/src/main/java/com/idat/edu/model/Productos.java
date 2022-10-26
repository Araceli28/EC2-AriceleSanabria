package com.idat.edu.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name ="productos")
public class Productos {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idProducto;
	private String producto;
	private String descripcion;
	private double precio;
	private Integer stock;
	
	@ManyToMany(mappedBy= "productos", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Cliente> cliente = new ArrayList<>();
	
	@OneToMany(mappedBy = "producto")
	private List<Bodega> bodegas = new ArrayList<>();
	
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
}
