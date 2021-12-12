package ciclo.cuatro.servicio.productos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_productos")
public class Producto {

	@Id
	private String _id;
	private long codigoProducto;
	private String nombreProducto;
	private long nitProveedor;
	private double precioCompra;
	private double ivaCompra;
	private double preciVenta;
	
	public Producto() {
		super();
	}

	public Producto(String _id, long codigoProducto, String nombreProducto, long nitProveedor, double precioCompra,
			double ivaCompra, double preciVenta) {
		super();
		this._id = _id;
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.nitProveedor = nitProveedor;
		this.precioCompra = precioCompra;
		this.ivaCompra = ivaCompra;
		this.preciVenta = preciVenta;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public long getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public long getNitProveedor() {
		return nitProveedor;
	}

	public void setNitProveedor(long nitProveedor) {
		this.nitProveedor = nitProveedor;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getIvaCompra() {
		return ivaCompra;
	}

	public void setIvaCompra(double ivaCompra) {
		this.ivaCompra = ivaCompra;
	}

	public double getPreciVenta() {
		return preciVenta;
	}

	public void setPreciVenta(double preciVenta) {
		this.preciVenta = preciVenta;
	}

	
}
