package unico;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		/* Un centro educativo nos ha pedido que diseñemos una aplicación
		 para calcular datos estadísticos de los alumnos. Se introducirán 
		 las edades de los alumnos hasta que una de ellas sea negativa. 
		 La aplicación mostrará la suma de las edades, la media, 
		 de cuántos alumnos hemos introducido su edad, y cuántos alumnos son mayores de edad.*/

		Scanner teclado = new Scanner(System.in);
		int edad;
		int suma;
		double media;
		int contador;
		int mayorEdad;
		
	
		 System.out.println("Introduzca la edad del alumno: ");
		 edad = Integer.parseInt(teclado.nextLine());
		 
		 suma=0;
		 contador =0;
		 mayorEdad =0;
		 media = 0.0;
		while (edad<0);{
			suma += edad;
			contador ++;
			media = suma / contador;
			if (edad>18) {
				mayorEdad ++;
			}
			System.out.println("Introduzca la edad del alumno: ");
			 edad = Integer.parseInt(teclado.nextLine());
		}
		
		
	} 
	

}
