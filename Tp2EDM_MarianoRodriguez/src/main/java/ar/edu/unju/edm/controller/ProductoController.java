package ar.edu.unju.edm.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.service.ProductoService;

@Controller

public class ProductoController {
	public static final Log NANO = LogFactory.getLog(ProductoController.class);
	@Autowired
	ProductoService iProductoService;

 @GetMapping("/productoo")
 public String cargarProducto(Model model) {
	model.addAttribute("unProducto", iProductoService.obtenerProductoNuevo());
	return ("productoo");
}
 
@PostMapping("/productoo")
public String cargarNuevoProducto(@ModelAttribute("unProducto") Producto nuevoProducto, Model model ) {
	iProductoService.guardarProducto(nuevoProducto);
	System.out.println(iProductoService.obtenerTodoProductos().get(0).getMarca());
	model.addAttribute("productos", iProductoService.obtenerTodoProductos());
	NANO.info("se guardo correctamente");
	return ("resultado");
	
}

@GetMapping("/volver")
public String cargarnuevoProducto(Model model) {
	return ("redirect:/productoo");
}
@GetMapping("/ultimo")
public String cargarUltimoProducto(Model model) {
	model.addAttribute("ultimoProducto", iProductoService.obtenerUltimoProducto());
	return("mostrar-ultimo");
}
}
