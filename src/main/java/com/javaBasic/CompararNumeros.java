package com.javaBasic;

import java.util.Scanner;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CompararNumeros {
	
	double i, y;
	

	
	@Test
	public void calcularPromedioPorTeclado() {
		Scanner reader = new Scanner(System.in);
		
		do {
		Reporter.log("Ingresa la calificacion 1",true);
		i=reader.nextDouble();
		
		}while (i <0 || i >100); 
		
		do {
		Reporter.log("Ingresa la calificacion 2",true);
		y=reader.nextDouble();
		}while(y <0 || y >100);
	
		
		double promedio= (i+y)/2;
		Reporter.log("El promedio de las calificaciones es: " + promedio,true);
		
		if (promedio<60 && promedio>0) {
			Reporter.log("Estàs reporbado con " +promedio, true);
			
		}else if (promedio >=60 && promedio <=100) {
			
			Reporter.log("Felicidades, estàs aprobado co: " +promedio, true);
		}

	}
	
	@Test 
	
	
	public void compararNumeros () {
		
		double num1, num2;
		
		Scanner reader = new Scanner(System.in);
		do {
			Reporter.log("Ingresa el primer nùmero a comparar",true);
			num1=reader.nextDouble();
			
			Reporter.log("Ingresa el segundo nùmero a comparar",true);
			num2=reader.nextDouble();
			
			}while (num1 != num2); 
		
		
		Reporter.log("Los numeros coinciden " +num1 +"y "+num2, true);
		
	}
	

}
