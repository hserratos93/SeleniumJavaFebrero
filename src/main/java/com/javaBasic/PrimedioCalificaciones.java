package com.javaBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrimedioCalificaciones {

	double calif=100;
	double calif2=90;
	double calif3=80;
	double calif4=70;
	
	@Test
	
	public void calcularPromedio () {
		
		double resultado = (calif+calif2+calif3+calif4)/4;
		Reporter.log("El promedio es: "+ resultado, true);
		
		if (resultado >=70 && resultado <=100) {
			Reporter.log("Est�s aprobado", true);
			
		}else if (resultado >=0 && resultado <70) {
			Reporter.log("Est�s reprobado con:" + resultado, true);
			
		}else {
			Reporter.log("La califiaci�n ingresada est� fuera de rango: "+resultado, true);
		}
		
	}
	
}//End class
