package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;
@Component
public class Producto {
private int codProducto,stock;
private String nombre,marca;
private double precio;
 
public Producto() {
	
}

public int getCodProducto() {
	return codProducto;
}

public void setCodProducto(int codProducto) {
	this.codProducto = codProducto;
}

public int getStock() {
	return stock;
}

public void setStock(int stock) {
	this.stock = stock;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

}
