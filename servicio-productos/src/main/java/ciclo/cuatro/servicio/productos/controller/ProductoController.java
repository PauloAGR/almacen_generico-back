package ciclo.cuatro.servicio.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ciclo.cuatro.servicio.productos.model.Producto;
import ciclo.cuatro.servicio.productos.repository.ProductoRepository;

@RestController
@RequestMapping(value = "/api/productos")
public class ProductoController {

	@Autowired
	private ProductoRepository repository;

	@PostMapping(value = "/agregar")
	public ResponseEntity<Producto> agregarProducto(@RequestBody Producto producto) {
		return ResponseEntity.ok(repository.save(producto));
	}

	@GetMapping(value = "/")
	public ResponseEntity<List<Producto>> listarProductos() {
		return ResponseEntity.ok(repository.findAll());
	}
}
