package ciclo.cuatro.servicio.clientes.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_clientes")
public class Cliente {
	
	@Id
	private String _id;
	private String cedula;
	private String nombreCompleto;
	private String direccion;
	private String telefono;
	private String correoElectronico;
	
	public Cliente() {
		super();
	}

	public Cliente(String _id, String cedula, String nombreCompleto, String direccion, String telefono,
			String correoElectronico) {
		super();
		this._id = _id;
		this.cedula = cedula;
		this.nombreCompleto = nombreCompleto;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	
	
}
