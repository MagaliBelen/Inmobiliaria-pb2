package ar.edu.unlam.pb2;

public class Departamento {
	private String codigo;
	private String calle;
	private Integer numero;
	private String localidad;
	private String depto;
	private Integer piso;
	private double precio;
	private boolean estaDisponible;
	private TipoDeOperacion tipo;
	
	public Departamento(String codigo,String calle, Integer numero, String localidad, String depto, Integer piso, double precio,
			boolean estaDisponible, TipoDeOperacion tipo) {
		this.setCodigo(codigo);
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.depto = depto;
		this.piso = piso;
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
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public Integer getPiso() {
		return piso;
	}
	public void setPiso(Integer piso) {
		this.piso = piso;
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
