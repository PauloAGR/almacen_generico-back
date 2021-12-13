package ciclo.cuatro.servicio.consolidacion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ciclo.cuatro.servicio.consolidacion.model.Consolidado;

public interface ConsolidadoRepository extends MongoRepository<Consolidado, String> {
	Consolidado findConsolidadoByCiudad(String ciudad);
}
