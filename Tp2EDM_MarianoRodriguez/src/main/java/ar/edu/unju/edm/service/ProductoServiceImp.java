package ar.edu.unju.edm.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Producto;
//como se hace la solucion del problema
//hoy guardamos en un arreglo Array
//el dia de mañana puedo guardar clase en una base de datos mySQL
//o tambien en Oracle...
	@Service
public class ProductoServiceImp implements ProductoService {

	@Autowired
	Producto unProducto;
	
	ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
	
	@Override
	public void guardarProducto(Producto unProducto) {
		// TODO Auto-generated method stub
		//esta línea la puse solo para que escriba en la consola el nombre del producto que llega
		//una línea que me sirve a mí de control
		//un log artesanal
		System.out.println(unProducto.getNombre());
		listaDeProductos.add(unProducto);
		
		//otra línea de control
		//quiero saber cuántos elementos hay en el arreglo
		System.out.println(listaDeProductos.size());
	}

	@Override
	public void modificarProducto(Producto productoAModificar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProducto(Producto productoAEliminar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto obtenerProducto(String nombreProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Producto> obtenerTodoProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto obtenerProductoNuevo() {
		// TODO Auto-generated method stub
		
		return unProducto;
	}

	@Override
	public Producto obtenerUltimoProducto() {
		// TODO Auto-generated method stub
		return null;
	}

}
