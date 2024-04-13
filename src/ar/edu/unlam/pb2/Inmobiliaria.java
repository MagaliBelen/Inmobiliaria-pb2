package ar.edu.unlam.pb2;
import java.util.Scanner;

public class Inmobiliaria {
	private String nombre;
	private String direccion;
	private String email;
	private String telefono;
	private final Integer CANT_MAX_DE_PROPIEDADES = 100;
	private final Integer CANT_MAX_DE_CLIENTES = 100;
	private Casa casas[];
	private Departamento departamentos[];
	private Cliente clientes[];
	private PH phs[];
	private Terreno terrenos[];
	private Campo campos[];
	
	public Inmobiliaria(String nombre, String direccion, String email, String telefono, Casa[] casas,
			Departamento[] departamentos, Cliente[] clientes, PH[] phs, Terreno[] terrenos, Campo[] campos) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
		this.casas = new Casa[CANT_MAX_DE_PROPIEDADES];
		this.departamentos = new Departamento[CANT_MAX_DE_PROPIEDADES];
		this.clientes = new Cliente[CANT_MAX_DE_CLIENTES];
		this.phs = new PH[CANT_MAX_DE_PROPIEDADES];
		this.terrenos = new Terreno[CANT_MAX_DE_PROPIEDADES];;
		this.campos = new Campo[CANT_MAX_DE_PROPIEDADES];
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Casa[] getCasas() {
		return casas;
	}
	public void setCasas(Casa[] casas) {
		this.casas = casas;
	}
	public Departamento[] getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(Departamento[] departamentos) {
		this.departamentos = departamentos;
	}
	public Cliente[] getClientes() {
		return clientes;
	}
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	public PH[] getPhs() {
		return phs;
	}
	public void setPhs(PH[] phs) {
		this.phs = phs;
	}
	public Terreno[] getTerrenos() {
		return terrenos;
	}
	public void setTerrenos(Terreno[] terrenos) {
		this.terrenos = terrenos;
	}
	public Campo[] getCampos() {
		return campos;
	}
	public void setCampos(Campo[] campos) {
		this.campos = campos;
	}
	public Integer getCANT_MAX_DE_PROPIEDADES() {
		return CANT_MAX_DE_PROPIEDADES;
	}
	public Integer getCANT_MAX_DE_CLIENTES() {
		return CANT_MAX_DE_CLIENTES;
	}
	
	//METODOS
	
	//Metodos para añadir
	
	//metodo para agregar clientes
		public Boolean add(Cliente nuevo) {
			for(int i=0; i< this.CANT_MAX_DE_CLIENTES ;i++) {
				if(clientes[i]==null) { 
					clientes[i] = nuevo; 
					return true; 
				}
			}
			return false; 
		}

		//metodo para agregar casas
		public Boolean add(Casa nueva) {
			for(int i=0; i<CANT_MAX_DE_PROPIEDADES ;i++) {
				if(casas[i]==null) { // si en esa posicion esta vacia
					casas[i] = nueva; // se agrega una nueva casa
					return true; //devuelve verdadero si lo pudo hacer
				}
			}
			return false; // si ya hay 100 casas cargadas devuelve falso
		}

		//metodo para agregar departamentos
		public Boolean add(Departamento nuevo) {
			for(int i=0; i<CANT_MAX_DE_PROPIEDADES ;i++) {
				if(departamentos[i]==null) { 
					departamentos[i] = nuevo;
					return true; 
				}
			}
			return false; 
		}
		
		//metodo para agregar campos
			public Boolean add(Campo nuevo) {
				for(int i=0; i<CANT_MAX_DE_PROPIEDADES ;i++) {
					if(campos[i]==null) { 
						campos[i] = nuevo;
						return true; 
					}
				}
				return false; 
			}
			
			//metodo para agregar phs
			public Boolean add(PH nuevo) {
				for(int i=0; i<CANT_MAX_DE_PROPIEDADES ;i++) {
					if(phs[i]==null) { 
						phs[i] = nuevo;
						return true; 
					}
				}
				return false; 
			}
				
			//metodo para agregar terrenos
			public Boolean add(Terreno nuevo) {
				for(int i=0; i<CANT_MAX_DE_PROPIEDADES ;i++) {
					if(terrenos[i]==null) { 
						terrenos[i] = nuevo;
						return true; 
					}
				}
				return false; 
			}
	
	//metodos para buscar propiedades
			
			//metodo para buscar casa
			public Casa buscarCasaPorCodigo(String codigo) {
				for(Casa casa : casas) {
					if(casa.getCodigo().equals(codigo)) {
						return casa;
					}
				}
				return null;
			}
			
			//metodo para buscar departamento
			public Departamento buscarDeptoPorCodigo(String codigo) {
				for(Departamento departamento : departamentos) {
					if(departamento.getCodigo().equals(codigo)) {
						return departamento;
					}
				}
				return null;
			}
			
			//metodo para buscar PH
			public PH buscarPHPorCodigo(String codigo) {
				for(PH ph : phs) {
					if(ph.getCodigo().equals(codigo)) {
						return ph;
					}
				}
				return null;
			}
			
			//metodo para buscar Campo
			public Campo buscarCampoPorCodigo(String codigo) {
				for(Campo campo : campos) {
					if(campo.getCodigo().equals(codigo)) {
						return campo;
					}
				}
				return null;
			}
			
			//metodo para buscar Terreno
			public Terreno buscarTerrenoPorCodigo(String codigo) {
				for(Terreno terreno : terrenos) {
					if(terreno.getCodigo().equals(codigo)) {
						return terreno;
					}
				}
				return null;
			}
			
		//Metodos para modificar propiedades
			
			//modificar casa
			
			public void modificarDatosCasa(String código, Scanner teclado) {
				Integer i = 0;
				Boolean revisión_finalizada = false;
				while(!revisión_finalizada) {
					if(i == this.getCasas().length) {
						revisión_finalizada = true;
					}
					else if(this.getCasas()[i] != null) {
						if(this.getCasas()[i].getCodigo().equals(código)) {
							System.out.print("Ingrese la nueva calle de la casa: ");
							this.getCasas()[i].setCalle(teclado.nextLine());
							// continuar
						}
						i++;
					}
					else{
						revisión_finalizada = true;
					}
				}
			}
		
			//Metodos para ordenar propiedades por precio
			
			//metodo para odenar casa por precio
			public void ordenarCasaPorPrecio() {
				for(int i = 0;i<casas.length - 1; i++) {
					for(int j =0; j<casas.length - i - 1; j++) {
						if(casas[j].getPrecio() > casas[j+1].getPrecio()) {
							Casa temp = casas[j];
							casas[j] = casas[j+1];
							casas[j+1]=temp;
						}
					}
				}
			}
			
			//metodo para odenar depto por precio
			public void ordenarDeptoPorPrecio() {
				for(int i = 0;i<departamentos.length - 1; i++) {
					for(int j =0; j<departamentos.length - i - 1; j++) {
						if(departamentos[j].getPrecio() > departamentos[j+1].getPrecio()) {
							Departamento temp = departamentos[j];
							departamentos[j] = departamentos[j+1];
							departamentos[j+1]=temp;
						}
					}
				}
			}
			
			//metodo para odenar ph por precio
			public void ordenarPHPorPrecio() {
				for(int i = 0;i<phs.length - 1; i++) {
					for(int j =0; j<phs.length - i - 1; j++) {
						if(phs[j].getPrecio() > phs[j+1].getPrecio()) {
							PH temp = phs[j];
							phs[j] = phs[j+1];
							phs[j+1]=temp;
						}
					}
				}
			}
			
			//metodo para odenar Campo por precio
			public void ordenarCampoPorPrecio() {
				for(int i = 0;i<campos.length - 1; i++) {
					for(int j =0; j<campos.length - i - 1; j++) {
						if(campos[j].getPrecio() > campos[j+1].getPrecio()) {
							Campo temp = campos[j];
							campos[j] = campos[j+1];
							campos[j+1]=temp;
						}
					}
				}
			}
			
			// Método para ordenar Terreno por precio
			public void ordenarTerrenoPorPrecio() {
			    for (int i = 0; i < terrenos.length - 1; i++) {
			        for (int j = 0; j < terrenos.length - i - 1; j++) {
			            if (terrenos[j].getPrecio() > terrenos[j + 1].getPrecio()) {
			                Terreno temp = terrenos[j];
			                terrenos[j] = terrenos[j + 1];
			                terrenos[j + 1] = temp;
			            }
			        }
			    }
			}

			//Metodos para mostrar las propiedades
			
			//Metodo mostrar casa
			public String mostrarCasa() {
				String resultado = "";
				for(int i=0; i<casas.length; i++) {
					if(casas[i]!=null) {
						resultado+=casas[i] + "\n";
					}
				}
				return resultado;
			}
			
			// Método para mostrar departamentos
			public String mostrarDepartamento() {
			    String resultado = "";
			    for (int i = 0; i < departamentos.length; i++) {
			        if (departamentos[i] != null) {
			            resultado += departamentos[i] + "\n";
			        }
			    }
			    return resultado;
			}
			// Método para mostrar terrenos
			public String mostrarTerreno() {
			    String resultado = "";
			    for (int i = 0; i < terrenos.length; i++) {
			        if (terrenos[i] != null) {
			            resultado += terrenos[i] + "\n";
			        }
			    }
			    return resultado;
			}
			// Método para mostrar campos
			public String mostrarCampo() {
			    String resultado = "";
			    for (int i = 0; i < campos.length; i++) {
			        if (campos[i] != null) {
			            resultado += campos[i] + "\n";
			        }
			    }
			    return resultado;
			}
			// Método para mostrar PH
			public String mostrarPH() {
			    String resultado = "";
			    for (int i = 0; i < phs.length; i++) {
			        if (phs[i] != null) {
			            resultado += phs[i] + "\n";
			        }
			    }
			    return resultado;
			}

			//calcula promedio de precios
			public Double calcularPrecioPromedioDeLasCasas() {
				Double promedio = 0.0;
				Double sumatoria = 0.0;
				Integer cantDeCasas = 0;
				Integer i = 0;
				Boolean revisión_finalizada = false;
				
				/*for(int i=0; i<casas.lenght; i++){
				 * Casa actual = casas[i];
				 * }*/
				//For each
				while(!revisión_finalizada) {
					if(i == this.getCasas().length) {
						revisión_finalizada = true;
					}
					else if(this.getCasas()[i] != null) {
						sumatoria += this.getCasas()[i].getPrecio();
						cantDeCasas ++;
						i++;
					}
					else{
						revisión_finalizada = true;
					}
				}
				if(cantDeCasas > 0) {
					promedio = sumatoria / cantDeCasas;
				}
				return promedio;
			}

			public Casa[] buscarCasaPorRangoDePrecio(Double precioInferior, Double precioSuperior) {
				Casa casas_validadas[] = new Casa[this.CANT_MAX_DE_PROPIEDADES];
				Integer j = 0;
				Integer i = 0;
				Boolean revisión_finalizada = false;
				while(!revisión_finalizada) {
					if(i == this.getCasas().length) {
						revisión_finalizada = true;
					}
					else if(this.getCasas()[i] != null) {
						if(this.getCasas()[i].getPrecio() > precioInferior && this.getCasas()[i].getPrecio() < precioSuperior) {
							casas_validadas[j] = this.getCasas()[i];
							j++;
						}
						i++;
					}
					else{
						revisión_finalizada = true;
					}
				}
				return casas_validadas;
			}
			
}
