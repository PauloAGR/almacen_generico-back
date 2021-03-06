package ciclo.cuatro.servicio.clientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ciclo.cuatro.servicio.clientes.model.Cliente;
import ciclo.cuatro.servicio.clientes.repository.ClienteRepository;

@RestController
@RequestMapping(value = "/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository repository;

	@PostMapping(value = "/agregar")
	public ResponseEntity<Cliente> agregarCliente(@RequestBody Cliente cliente) {
		return ResponseEntity.ok(repository.save(cliente));
	}

	@GetMapping(value = "/")
	public ResponseEntity<List<Cliente>> listarClientes() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping(value = "/{cedula}")
	public Cliente obtenerCliente(@PathVariable String cedula) {
		return repository.findByCedula(cedula);
	}

	@DeleteMapping(value = "/eliminar/{cedula}")
	public ResponseEntity<String> eliminarCliente(@PathVariable("cedula") String cedula) {
		repository.deleteByCedula(cedula);
		return ResponseEntity.ok("eliminado");
	}
}
