package ar.edu.unlam.pb2;

public class Terreno {
	private String codigo;
	private String calle;
	private Integer numero;
	private String localidad;
	private double metros_cuadrados;
	private double precio;
	private boolean estaDisponible;
	private TipoDeOperacion tipo;
	
	public Terreno(String codigo,String calle, Integer numero, String localidad, double metros_cuadrados, double precio,
			boolean estaDisponible, TipoDeOperacion tipo) {
		this.codigo=codigo;
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.metros_cuadrados = metros_cuadrados;
		this.precio = precio;
		this.estaDisponible = estaDisponible;
		this.tipo = tipo;
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public double getMetros_cuadrados() {
		return metros_cuadrados;
	}
	public void setMetros_cuadrados(double metros_cuadrados) {
		this.metros_cuadrados = metros_cuadrados;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isEstaDisponible() {
		return estaDisponible;
	}
	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}
	public TipoDeOperacion getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeOperacion tipo) {
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
}
