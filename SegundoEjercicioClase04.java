package EjercicioDosClaseTres;

import java.util.*;

public class SegundoEjercicioClase04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//calcular indice de masa muscular
		//peso en Kg / (altura*altura en metros)).
		//Devuelve -1 si el IMC < 20 (debajo del peso ideal),
		//entre 20 y 25 devuelve 0 (en peso) y
		//si es mas de 25 devuelve 1 (por encima del peso).
		
		
		//Atributos
		
		Persona primerPersona = new Persona(null, null, null, 0, 0);
		
		//scanners
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = teclado.nextLine();
		primerPersona.setNombre(nombre);
		
		Scanner teclado2 = new Scanner(System.in);
		
		System.out.println("Ingrese su Apellido: ");
		String apellido = teclado2.nextLine();
		primerPersona.setApellido(apellido);
		
		Scanner teclado3 = new Scanner(System.in);
		
		System.out.println("Ingrese su Edad: ");
		int edad = teclado3.nextInt();
		primerPersona.setEdad(edad);
		
		Scanner teclado4 = new Scanner(System.in);
		
		System.out.println("Ingrese su DNI: ");
		int dni = teclado4.nextInt();
		primerPersona.setDni(dni);
		
		Scanner Peso = new Scanner(System.in);
		
		System.out.println("Ingrese su peso en KG: ");
		double peso = teclado4.nextDouble();
		primerPersona.setPeso(peso);
		
		Scanner teclado5 = new Scanner (System.in);
		
		System.out.println("Ingrese su Altura en Metros (con coma): ");
		double altura = teclado5.nextDouble();
		primerPersona.setAltura(altura);
		
		
		//metodo calculo imc
		
		
		
		if (primerPersona.peso / (primerPersona.altura * primerPersona.altura) < 20){
			System.out.println("Usted esta flaco");
			
			
		}
		else if (primerPersona.peso / (primerPersona.altura * primerPersona.altura) > 20 && primerPersona.peso / (primerPersona.altura * primerPersona.altura) < 25){
			System.out.println("Usted esta en un peso normal");
			
			
		}
		else if (primerPersona.peso / (primerPersona.altura * primerPersona.altura) > 25) {
			System.out.println("Usted esta gordo");
			
			
		}
		// usted es mayor de edad?
		
		boolean mayorDeEdad;
		
		if (primerPersona.edad >= 21) {
			mayorDeEdad = (true);	
		}
		
		else {
			mayorDeEdad = (false);
		}
		
		
		System.out.println("Nombre: " + primerPersona.getNombre() + " " + primerPersona.getApellido() + " con una edad de: " + primerPersona.getEdad() + " anios," + " DNI numero: " + primerPersona.getDni() + " con un peso de: " + primerPersona.getPeso() + " KG " + " y una altura de: " + primerPersona.getAltura() + " metros.");
		
		System.out.println("eres mayor de edad? " + mayorDeEdad);
		
		
	}

}
