package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaUnitariaAutomatizada {

	@Test
	public void queSeCalculeCorrectamenteElPrecioPromedioDeLasCasasALaVenta() {
		//Preparacion de datos
		
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Borrello", "Av Eva Peron 987", "borrello@gmail.com", "15586476698", null, null, null, null, null, null);
		Casa casa1 = new Casa("C5659", "Eva Peron", 5980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA);
		Casa casa2 = new Casa("C5689", "Gaona", 598, "Ramos", 60000.00, true, TipoDeOperacion.VENTA);
		Casa casa3 = new Casa("C5759", "Eva Peron", 6000, "Mataderos", 50000.00, true, TipoDeOperacion.VENTA);
		
		//Ejecucion
		
		inmobiliariaActual.add(casa1);
		inmobiliariaActual.add(casa2);
		inmobiliariaActual.add(casa3);
		
		//Validacion
		
		//Valor actual, valor esperado, diferencia aceptable
		assertEquals(70000.0, inmobiliariaActual.calcularPrecioPromedioDeLasCasas(), 0.01);
		
		//Usar assert en vez de:
		/*if(inmobiliariaActual.calcularPrecioPromedioDeLasCasas()==70000) {
			System.out.println("dio ok");
		}else {
			System.out.println("no dio ok");
		}*/
		
		
	}
	
	
	@Test
	public void queSiNoTengoCasaElPrecioPromedioDeCero() {
		//Preparacion de datos
		
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Borrello", "Av Eva Peron 987", "borrello@gmail.com", "15586476698", null, null, null, null, null, null);
		//Validacion
				
		//Valor actual, valor esperado, diferencia aceptable
		assertEquals(0.0, inmobiliariaActual.calcularPrecioPromedioDeLasCasas());
				
	}
	
	//suponiendo que no declare el tostring
	@Test
	public void queSiConsultoElToStringDeUnaCasaObtengaElCodigo() {
		//Preparacion de datos
		String elCodigoEsperado = "CS1";
		//Ejecucion
		Casa casa4 = new Casa("CS1", "Eva Peron", 5980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA);
		//Validacion
		assertEquals(elCodigoEsperado, casa4);
	}

	
	@Test
	public void queSiBuscoUnaCasaPorRangoDePrecioLaEncuentroCorrectamente() {
		//Preparacion de datos
		Double precioInferior = 0.0;
		Double precioSuperior = 60000.0;
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Borrello", "Av Eva Peron 987", "borrello@gmail.com", "15586476698", null, null, null, null, null, null);
		Casa casa1 = new Casa("C5659", "Eva Peron", 5980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA);
		Casa casa2 = new Casa("C5689", "Gaona", 598, "Ramos", 60000.00, true, TipoDeOperacion.VENTA);
		Casa casa3 = new Casa("C5759", "Eva Peron", 6000, "Mataderos", 50000.00, true, TipoDeOperacion.VENTA);
		
		//Ejecucion
		
		inmobiliariaActual.add(casa1);
		inmobiliariaActual.add(casa2);
		inmobiliariaActual.add(casa3);
		
		Casa casasEncontradas[] = inmobiliariaActual.buscarCasaPorRangoDePrecio(precioInferior,precioSuperior);
		
		//Validacion
		
		//Valor actual, valor esperado, diferencia aceptable
		assertNotNull1(casasEncontradas);
	}
	

	@Test
	public void queSePuedaDarDeAltaUnaCasaEnLaInmobiliaria(){
		//Preparacion de datos
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Borrello", "Av Eva Peron 987", "borrello@gmail.com", "15586476698", null, null, null, null, null, null);
		Casa casa1 = new Casa("C5659", "Eva Peron", 5980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA);
	        
	     //Ejecucion
	        boolean altaExitosa = inmobiliariaActual.add(casa1);
	        
	     // Verificar si la alta fue exitosa
	        assertTrue(altaExitosa);
	}
	
	@Test
	public void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() {
		//Preparacion de datos
				Inmobiliaria inmobiliariaActual = new Inmobiliaria("Borrello", "Av Eva Peron 987", "borrello@gmail.com", "15586476698", null, null, null, null, null, null);
				Casa casa1 = new Casa("C5659", "Eva Peron", 5980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA);
				Casa casa2 = new Casa("C5689", "Gaona", 598, "Ramos", 60000.00, true, TipoDeOperacion.VENTA);
				
		//Ejecucion
				 boolean altaExitosa = inmobiliariaActual.add(casa1);
				 boolean altaExitosa2 = inmobiliariaActual.add(casa2);
				 
		 // Verificar si la alta fue exitosa
			       assertTrue(altaExitosa);
			       assertTrue(altaExitosa2);
	}
	
	@Test
	public void queNoSePuedanDarDeAltaDosCasasConUnaMismaDireccion() {
		
	}
	
}
