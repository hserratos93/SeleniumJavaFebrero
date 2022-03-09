package com.javaBasic;

import org.testng.annotations.Test;


import javaMain.ArreglosCurso;

public class TestArreglo {
	
	@Test
	
	public void probarArreglos() {
		
		ArreglosCurso arreglos = new ArreglosCurso ();
		
		arreglos.crearArreglo();
		
	    arreglos.listaDeStrings();
		
//		arreglos.listasDeEnteros();
		
//		arreglos.invertirOrdernArreglo();
		
//		arreglos.crearArreglo();
		
		
	}//end probarArreglos

}
