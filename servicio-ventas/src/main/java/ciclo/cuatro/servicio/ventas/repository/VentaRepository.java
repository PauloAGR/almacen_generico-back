package ciclo.cuatro.servicio.ventas.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ciclo.cuatro.servicio.ventas.model.Venta;

public interface VentaRepository extends MongoRepository<Venta, String> {
	
	List<Venta> findVentasByCedulaCliente(String cedulaCliente);

	Venta findVentaByCodigoVenta(long codigoVenta);
}
