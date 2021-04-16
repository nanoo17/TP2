package ar.edu.unju.edm.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Producto;
@Service
public interface ProductoService {
//que hace con Producto;
	
	public void guardarProducto(Producto unProducto);
	public void modificarProducto(Producto productoAModificar);
	public void eliminarProducto(Producto productoAEliminar);
	public Producto obtenerProducto(String nombreProducto);
	public ArrayList<Producto> obtenerTodoProductos();
	public Producto obtenerProductoNuevo();
	public Producto obtenerUltimoProducto();
}
