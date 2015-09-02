import java.util.HashSet;
import java.util.Scanner;


/**
 * @author Rodrigo Castro #14092
 * Hugo Noriega #14097
 * Algoritmos Y Estrcuturas de Datos
 *
 */
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada= new Scanner(System.in);
		
		// Creacion del factory
		FabricaDeTipo nuevaFabrica;
		TiposDeSet nuevoTipo;
		
		// Se eligi el tipo de implementacion
		System.out.println("Ingrese el tipo de intefaz SET que desea utilizar:");
		System.out.println("HashSet");
		System.out.println("TreeSet");
		System.out.println("LinkedHashSet");
		
		//Creacion  de objetode TipoDeSet elegidio
		//nuevoTipo hace referencia al padre
		String tipo = entrada.nextLine();
		nuevaFabrica = new FabricaDeTipo(tipo);
		nuevoTipo = nuevaFabrica.crearTipo();
		
		
		//Mientras la respuesta de continuar sea Si
		String resp = "si";
		
		while (resp.equalsIgnoreCase("si")){
			System.out.println(" *-----------------------------------*");
			
			System.out.println("Ingrese el nombre de Desarollador: ");
			String nombre = entrada.nextLine();
			System.out.println("Pertenece a desarollador Java (si/no)");
			
			String devJava = entrada.nextLine();
			
			System.out.println("Pertenece a desarollador Web (si/no)");
			
			String devWeb = entrada.nextLine();
			
			System.out.println("Pertenece a desarollador Celulares (si/no)");
			
			
			String devCel = entrada.nextLine();	
			
			//Se ingresan parametros a constructor
			Desarollador d = new Desarollador(nombre, devJava, devWeb, devCel );
			//Se realizar el Set a tipo elegido, con el objeto d
			nuevoTipo.setD(d);
			nuevoTipo.Agregar();
			
			
			//Se despliega la informacion
			
			System.out.println("Desea continuar si/no:");
			resp = entrada.nextLine();
			
			System.out.println(" *-----------------------------------*");

			
		
			
		}
		
		System.out.println(" *-----------------------------------*");


		
		 // Muestra el resultado de la pregunta 1, la intereseccion de los tres conjuntos
		 
		
		
		System.out.println("Desarolladores Java, Web, Celulares");
		nuevoTipo.Conjunto1();
		
		System.out.println(" *-----------------------------------*");

		// Muestra el resultado de pregunta 2
		System.out.println("Desarolladores Java sin experiencia en web: ");
		
		nuevoTipo.Conjunto2();
		
		System.out.println(" *-----------------------------------*");

		//Muestra resultado pregunta 3
		System.out.println("Desarolladores en Web y Celulares, sin experiencia Java");
		nuevoTipo.Conjunto3();
		System.out.println(" *-----------------------------------*");
		
		//Muestra resultado pregunta 4


		System.out.println("Desarolladores en Web o Celulares, sin experiencia Java");
		nuevoTipo.Conjunto4();
		System.out.println(" *-----------------------------------*");

		//Respuesta a Pregunta 5
		System.out.println("El conjunto de desarolladores Java es subconjunto de Desorolladores Web? :");

		System.out.println(" *-----------------------------------*");

		//nuevoTipo.Conjunto5();
		
		
		//Respuesta a pregunta 6 y 7
		System.out.println("El conjunto de desarolladores mas grande: ");

		
		nuevoTipo.conjuntoMayor();
		
	}

}
