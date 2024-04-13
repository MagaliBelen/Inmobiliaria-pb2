package ar.edu.unlam.pb2;


public class Casa {
	private String codigo;
	private String calle;
	private Integer numero;
	private String localidad;
	private double precio;
	private boolean estaDisponible;
	private TipoDeOperacion tipo;
	
	public Casa(String codigo, String calle, Integer numero, String localidad, double precio, boolean estaDisponible,
			TipoDeOperacion tipo) {
		this.codigo=codigo;
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
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
	
	@Override
	public String toString() {
		return "Casa [codigo=" + codigo + ", calle=" + calle + ", numero=" + numero + ", localidad=" + localidad
				+ ", precio=" + precio + ", estaDisponible=" + estaDisponible + ", tipo=" + tipo + "]";
	}
	
	
}
