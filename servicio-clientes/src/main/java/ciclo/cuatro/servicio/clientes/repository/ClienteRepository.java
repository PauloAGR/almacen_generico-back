package ciclo.cuatro.servicio.clientes.repository;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import ciclo.cuatro.servicio.clientes.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
	Optional<Cliente> findClienteByNombreCompleto(String nombreCompleto);
	Cliente findByCedula(String cedula);
	void deleteByCedula(String cedula);
}
