package ciclo.cuatro.servicio.consolidacion.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_consolidado")
public class Consolidado {

	@Id
	private String _id;
	private String ciudad;
	private double totalVentas;

	public Consolidado() {
		super();
	}

	public Consolidado(String _id, String ciudad, double totalVentas) {
		super();
		this._id = _id;
		this.ciudad = ciudad;
		this.totalVentas = totalVentas;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public double getTotalVentas() {
		return totalVentas;
	}

	public void setTotalVentas(double totalVentas) {
		this.totalVentas = totalVentas;
	}

}
