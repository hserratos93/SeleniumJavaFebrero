package javaMain;

public class Arreglos {
	
	private int numero1;
	private int numer2;
	
	/**
	 * @Description Constructor sin parámetros
	 * @Author 
	 * @date 05/03/2022
	 * @param numero1
	 * @param numer2
	 * @return N/A
	 */
	
	public Arreglos() {
		
	}
		
	/**
	 * @Description Constructor con parámetros
	 * @param numero1
	 * @param numer2
	 */
	public Arreglos(int numero1, int numer2) {
		this.numero1 = numero1;
		this.numer2 = numer2;
	}
	/**
	 * @return the numero1
	 */
	public int getNumero1() {
		return numero1;
	}
	/**
	 * @return the numer2
	 */
	public int getNumer2() {
		return numer2;
	}
	/**
	 * @param numero1 the numero1 to set
	 */
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	/**
	 * @param numer2 the numer2 to set
	 */
	public void setNumer2(int numer2) {
		this.numer2 = numer2;
	}
	
	/**
	 * @Description crear arrelgo y asignarle valor y mostrar en consola valores
	 * @Author 
	 * @date 05/03/2022
	 * @param numero1
	 * @param numer2
	 * @return N/A
	 */
	public void crearArreglo () {
		
		int [] arreglo1 = {1,2,3,4,5};
		int sizeArreglo = arreglo1.length;
		
		for (int i=0; i<sizeArreglo; i++) {
			System.out.println("El valor del Arreglo es: " +arreglo1[i]);
			
		}
		
		int []arreglo2 = new int [10];
		
		
	}


}
