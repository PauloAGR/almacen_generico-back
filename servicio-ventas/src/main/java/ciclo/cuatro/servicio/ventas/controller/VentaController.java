package ciclo.cuatro.servicio.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ciclo.cuatro.servicio.ventas.model.Venta;
import ciclo.cuatro.servicio.ventas.repository.VentaRepository;

@RestController
@RequestMapping(value = "/api/ventas")
public class VentaController {

	@Autowired
	private VentaRepository repository;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping(value = "/agregar")
	public ResponseEntity<Venta> agregarVenta(@RequestBody Venta venta) {
		venta.setCodigoVenta(repository.count() + 1);
		return ResponseEntity.ok(repository.save(venta));
	}

	@GetMapping(value = "/")
	public ResponseEntity<List<Venta>> listarVentas() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping(value = "/{cedula_cliente}")
	public ResponseEntity<List<Venta>> detalleVentasCliente(@PathVariable ("cedula_cliente") String cedulaCliente){
		return ResponseEntity.ok(repository.findVentasByCedulaCliente(cedulaCliente));
	}
	
	@GetMapping(value = "/detalle/{codigo_venta}")
	public ResponseEntity<Venta> detalleVenta(@PathVariable ("codigo_venta") long codigoVenta){
		return ResponseEntity.ok(repository.findVentaByCodigoVenta(codigoVenta));
	}
}
