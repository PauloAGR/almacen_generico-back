package ciclo.cuatro.servicio.ventas.dto;

public class Producto {

	private long codigoProducto;
	private int cantidadProducto;
	private double valorTotal;
	private double valorVenta;
	private double valorIva;

	public Producto() {
		super();
	}

	public Producto(long codigoProducto, int cantidadProducto, double valorTotal, double valorVenta, double valorIva) {
		super();
		this.codigoProducto = codigoProducto;
		this.cantidadProducto = cantidadProducto;
		this.valorTotal = valorTotal;
		this.valorVenta = valorVenta;
		this.valorIva = valorIva;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(double valorVenta) {
		this.valorVenta = valorVenta;
	}

	public double getValorIva() {
		return valorIva;
	}

	public void setValorIva(double valorIva) {
		this.valorIva = valorIva;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public long getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

}
