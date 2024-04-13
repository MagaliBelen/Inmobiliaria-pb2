package ar.edu.unlam.pb2;

import java.util.Scanner;

import ar.edu.unlam.pb2.Inmobiliaria;

public interface InterfazInmobiliaria {

	static Inmobiliaria inmobiliariaActual = new Inmobiliaria("Borrello", "Av Eva Peron 987", "borrello@gmail.com", "15586476698", null, null, null, null, null, null);
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Integer opcionSeleccionada = 0;
		Integer tipoPropiedad = 0;
		Integer datoAModificar = 0;
		
		
		do {
		System.out.println("Menu de opciones");
		System.out.println("1. Agregar nuevas propiedades");
		System.out.println("2. Modificar propiedades existentes");
		System.out.println("3. Agregar clientes");
		System.out.println("4. Obtener listado de propiedades ordenado por precio.");
		System.out.println("5. Obtener el listado de propiedades ordenado por ubicación.");
		System.out.println("6. Buscar propiedades por Rango de precios");
		System.out.println("7. Buscar propiedades por Ubicación (Ciudad)");
		System.out.println("8. Realizar la venta de una propiedad");
		System.out.println("9. Realizar el alquiler de una propiedad");
		System.out.println("10. Promedio de Casas");
		System.out.println("11. Salir");
		
		opcionSeleccionada = teclado.nextInt();
		
		switch(OpcionDeMenu.values()[opcionSeleccionada]) {
		case AGREGAR_PROPIEDAD:
			/*tipoPropiedad = menuPropiedades(teclado);
			agregarPropiedad(tipoPropiedad);*/
			break;
		case MODIFICAR_PROPIEDAD:
			System.out.println(inmobiliariaActual.mostrarCasa());
			System.out.println(inmobiliariaActual.mostrarDepartamento());
			System.out.println(inmobiliariaActual.mostrarCampo());
			System.out.println(inmobiliariaActual.mostrarTerreno());
			System.out.println(inmobiliariaActual.mostrarPH());
			System.out.println("Introduzca codigo de propiedad");
			String codigo = teclado.next();
			/*tipoPropiedad = menuPropiedades(teclado);
			 * datoAModificar = menuModificarPropiedad(teclado, tipoPropiedad);
			 * Object datoNuevo = solicitarDato(datoAModificar);*
			 * buscarYModificarPropiedad(codigo, datoAModificar, datoNuevo);*/
			break;
		case AGREGAR_CLIENTE:
			//inmobiliariaActual.add(Cliente nuevo);
			break;
		case OBTENER_LISTADO_POR_PRECIO:
			tipoPropiedad = menuPropiedades(teclado);
			
			break;
		case OBTENER_LISTADO_POR_UBICACION:
			break;
		case BUSCAR_PROPIEDADES_POR_PRECIO:
			break;
		case BUSCAR_PROPIEDADES_POR_UBICACION:
			break;
		case REALIZAR_VENTA:
			break;
		case REALIZAR_ALQUILER:
			break;
		case CALCULAR_EL_PRECIO_PROEDIO_DE_LAS_CASAS:
			System.out.println(inmobiliariaActual.calcularPrecioPromedioDeLasCasas());
			break; 
		case SALIR:
			break;
		
		}
		
		
		}while(opcionSeleccionada!=11);
	}//termina void main
	
	
	
	
}
