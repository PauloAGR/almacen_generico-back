package ciclo.cuatro.servicio.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@PostMapping(value = "/csv")
	public ResponseEntity<String> agregarListadoProductos(@RequestBody List<Producto> listado) {
		for (Producto pro : listado) {
			repository.save(pro);
		}
		return ResponseEntity.ok("Listado Agregado");
	}

	@GetMapping(value = "/")
	public ResponseEntity<List<Producto>> listarProductos() {
		return ResponseEntity.ok(repository.findAll());
	}

	@DeleteMapping(value = "/eliminar/{codigo_producto}")
	public ResponseEntity<String> eliminarProducto(@PathVariable("codigo_producto") long codigoProducto) {
		return ResponseEntity.ok(repository.deleteProductoByCodigoProducto(codigoProducto));
	}

	@PutMapping(value = "/actualizar")
	public ResponseEntity<Producto> actualizarProducto(@RequestBody Producto producto) {
		return ResponseEntity.ok(repository.save(producto));
	}
}
