package ciclo.cuatro.servicio.ventas.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import ciclo.cuatro.servicio.ventas.dto.Producto;

@Document(collection = "db_ventas")
public class Venta {

	@Id
	private String _id;
	private long codigoVenta;
	private String cedulaCliente;
	private ArrayList<Producto> detalleVenta;
	private double ivaVenta;
	private double totalVenta;
	private double valorVenta;

	public Venta() {
		super();
	}

	public Venta(String _id, long codigoVenta, String cedulaCliente, ArrayList<Producto> detalleVenta, double ivaVenta,
			double totalVenta, double valorVenta) {
		super();
		this._id = _id;
		this.codigoVenta = codigoVenta;
		this.cedulaCliente = cedulaCliente;
		this.detalleVenta = detalleVenta;
		this.ivaVenta = ivaVenta;
		this.totalVenta = totalVenta;
		this.valorVenta = valorVenta;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public long getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(long codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public ArrayList<Producto> getDetalleVenta() {
		return detalleVenta;
	}

	public void setDetalleVenta(ArrayList<Producto> detalleVenta) {
		this.detalleVenta = detalleVenta;
	}

	public double getIvaVenta() {
		return ivaVenta;
	}

	public void setIvaVenta(double ivaVenta) {
		this.ivaVenta = ivaVenta;
	}

	public double getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}

	public double getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(double valorVenta) {
		this.valorVenta = valorVenta;
	}

}
