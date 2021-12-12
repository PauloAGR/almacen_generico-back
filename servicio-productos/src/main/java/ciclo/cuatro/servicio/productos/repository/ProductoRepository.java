package ciclo.cuatro.servicio.productos.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import ciclo.cuatro.servicio.productos.model.Producto;

public interface ProductoRepository extends MongoRepository<Producto, String> {
	Optional<Producto> findProductoByNombreProducto(String nombreProducto);
}
