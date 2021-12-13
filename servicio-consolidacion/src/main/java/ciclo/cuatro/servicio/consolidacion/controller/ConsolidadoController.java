package ciclo.cuatro.servicio.consolidacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ciclo.cuatro.servicio.consolidacion.model.Consolidado;
import ciclo.cuatro.servicio.consolidacion.repository.ConsolidadoRepository;

@RestController
@RequestMapping(value = "/api/consolidado")
public class ConsolidadoController {

	@Autowired
	private ConsolidadoRepository repository;

	@PostMapping(value = "/agregar")
	public ResponseEntity<Consolidado> agregarConsolidado(@RequestBody Consolidado consolidado) {
		double total = consolidado.getTotalVentas()
				+ repository.findConsolidadoByCiudad(consolidado.getCiudad()).getTotalVentas();
		consolidado.setTotalVentas(total);
		return ResponseEntity.ok(repository.save(consolidado));
	}

	@GetMapping(value = "/")
	public ResponseEntity<List<Consolidado>> listarConsolidados() {
		return ResponseEntity.ok(repository.findAll());
	}
}
