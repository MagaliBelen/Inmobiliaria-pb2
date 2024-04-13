package ar.edu.unlam.pb2;

public class Campo {
	private String codigo;
	private String calle;
	private String localidad;
	private Integer hectareas;
	private double precio;
	private boolean estaDisponible;
	private TipoDeOperacion tipo;
		
	public Campo(String codigo,String calle, String localidad, Integer hectareas, double precio, boolean estaDisponible,
			TipoDeOperacion tipo) {
		this.setCodigo(codigo);
		this.calle = calle;
		this.localidad = localidad;
		this.hectareas = hectareas;
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
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public Integer getHectareas() {
		return hectareas;
	}
	public void setHectareas(Integer hectareas) {
		this.hectareas = hectareas;
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
