package examenParcialUno;

import java.util.Scanner;

public class MainExamen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Examen respuesta = new Examen();
		
		while (true) {
			System.out.println("Que herramienta quieres usar? fizzbuzz, invertir una cadena, vocales en mayusculas, primera mayuscula, palindromo o si quieres salirte escribe salir");
			String eleccion = scan.nextLine();
			switch (eleccion) {
			case "fizzbuzz":
				respuesta.fizz();
				
				break;
				
			case "invertir cadena":
				  System.out.print("Introduce una palabra: ");
				    String oracion = scan.nextLine();
				    String volteau = respuesta.voltear(oracion);
				    System.out.println("Palabra invertida: " + volteau);
				    
				break;
				
			case "primera mayuscula":
				System.out.println("Ingresa la oracion");
				String oracionmayus = scan.nextLine();
			    String Mayus = respuesta.primeraMayuscula(oracionmayus);
			    System.out.println("Oración con la primera letra en mayúscula: " + Mayus);
				
			    break;
			    
			case "vocales en mayusculas":
				System.out.println("Introduce una frase:");
				String frase = scan.nextLine();
			    String resultado = respuesta.vocalesMayuscula(frase);
			    System.out.println("Frase: " + resultado);
			       
			    break;
			
			case "palindromo":
				 System.out.print("Introduce una frase: ");
			        String frasepalin = scan.nextLine();
			        if (respuesta.palindromo(frasepalin)) {
			            System.out.println("Es un palíndromo.");
			        } else {
			            System.out.println("No es un palíndromo.");
			        }
				break;
			    
			case "salir":
				System.out.println("Adios");
				System.exit(0);
				break;
				
			}
		}
	}
}