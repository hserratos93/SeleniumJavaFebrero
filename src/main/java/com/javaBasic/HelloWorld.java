package com.javaBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelloWorld {
	
	//Variable de instancia
	int suma =20;
	

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
	}//end main
	
	
	
	@Test
	
	public void showConsole () {
		
		int numero2 =10;
		System.out.println("HelloWorld TestNG");
		Reporter.log ("HolaMundo",true);
		suma= suma+numero2;
		Reporter.log("la suma de es: "+suma, true);
	}
	
	@Test
	
	public void tipoVariable() {
		
		//Primitivas
		int numero = 100;
		char caracter ='a';
		float numeroDecimal = 1.2f;
		double decimaGrande = 1.245652;
		boolean falsoVerdadero = true;
		
		//No primitivas y vienen de una clase
		String nombre= "Hugo";
		Boolean verdaderoFalso2= false;
		Double decimalGrande2 =15452.234512;
		Reporter.log ("El valor de la variable num1 es: "+ numero, true);
		int multiplicacion = suma*numero;
		Reporter.log("la multiplicación es: "+multiplicacion, true);
			
	}
	
	@Test
	
	public void operacionesAritmeticas () {
		
		int num1=2;
		int num2=5;
		double resultado;
		
	}
	
}//End class
