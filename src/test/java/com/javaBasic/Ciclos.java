package com.javaBasic;

import java.util.Scanner;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ciclos {
	
		
		@Test
		public void ciclos() {
			
			int index = 0;
			int numero;
			
			Scanner valor = new Scanner (System.in);
			System.out.println("Ingresa un n?mero");
			numero = valor.nextInt();
			
			
			for(int i=1; i<=numero; i++) {
				
				Reporter.log("El valor de nuestro indice es FOR: " + i,true);
				
			}
			
			System.out.println("\n");
			while(index<=numero) {
				
				Reporter.log("El valor de nuestro indice es WHILE: " + index,true);
				index++;
			}
			
			
		}//end ciclo
		
		@Test
		public void condicionalSwitch() {
			Scanner reader = new Scanner(System.in);
			Reporter.log("Ingresa un numero de mes", true);
			String mes = reader.next();
			reader.close();
			
			switch (mes) {
			case "1":
				Reporter.log("Enero", true);
				break;
			case "2":
				Reporter.log("Febrero", true);
				break;
			case "3":
				Reporter.log("Marzo", true);
				break;
			case "4":
				Reporter.log("Abril", true);
				break;
			case "5":
				Reporter.log("Mayo", true);
				break;
			case "6":
				Reporter.log("Junio", true);
				break;
			case "7":
				Reporter.log("Julio", true);
				break;
			case "8":
				Reporter.log("Agosto", true);
				break;
			case "9":
				Reporter.log("Septiembre", true);
				break;
			case "10":
				Reporter.log("Octubre", true);
				break;
			case "11":
				Reporter.log("Noviembre", true);
				break;
			case "12":
				Reporter.log("Diciembre", true);
				break;
				
				default:
					Reporter.log("El numero que ingresaste no corresponde a ningun mes [ "+ mes+" ]", true);
				
				
			}//end switch
			
			
			
			
		}

}//END class
