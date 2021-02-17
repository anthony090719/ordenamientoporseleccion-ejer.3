package ordenamientoMetodoSeleccion;

import java.util.Scanner;

public class Seleccion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int arreglo[], DPI;
		boolean creciente = true;
		arreglo = new int[10];
		
		do {
			System.out.println("introduzca el DPI a encontrar");
			for(int i=0;i<10;i++) {
				System.out.println(i+". Digite su DPI NOTA: el siguiente DPI debe ser mayor al anterior ");
				arreglo[i] = entrada.nextInt();
				
			}
			for(int i=0;i<9;i++) {
				if (arreglo[i] < arreglo[i+1]) {
					creciente = true;			
				}
				if (arreglo[i] >  arreglo[i+1] ) {
					creciente = false;
					break;
					
					
				}
			}
			
			if(creciente ==false) {
				System.out.println("los DPI deben de ir en orden creciente");
			}
			
		}while(creciente == false);
		
		System.out.println("digite el DPI a buscar");
		DPI = entrada.nextInt();
		
		int i=0;
		while(i<10 && arreglo[i]<DPI) {
			i++;
			
		}
		
		if(i==10) {
			System.out.println("DPI no encontrado");
			
		}
		
		else {
			if(arreglo[i]== DPI) {
				System.out.println("el dato fue encontrado en la posicion: "+i);
				
			}
			
			else {
				System.out.println("Dpi no encontrado");
			}
			
			
		}
	}
}
		

