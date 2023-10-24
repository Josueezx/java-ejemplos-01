package clases;
import java.util.Scanner;


public class ClaseScanner {
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		//variables
		
		int edad;
		String nombre;
		double sueldo;
		
		//entradas
		System.out.println(" Ingrese nombre: ");
		nombre = t.nextLine();
		
		System.out.println(" Ingrese sueldo: ");
		sueldo = t.nextDouble();
		
		System.out.println(" Ingrese edad: ");
		edad = t.nextInt();
		
		//salidas
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Sueldo: "+sueldo);
		System.out.println("Nombre: "+edad);

		
		
		
		
		
		
	}

}
