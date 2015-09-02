import static org.junit.Assert.*;

import org.junit.Test;


public class PruebasUnitarias {
	
	
	FabricaDeTipo nuevaFabrica;
	TiposDeSet nuevoTipo;

	@Test
	public void HashSet() {

		nuevaFabrica = new FabricaDeTipo("HashSet");
		nuevoTipo = nuevaFabrica.crearTipo();
		
		
		String nombre = "Rodrigo";
		String devJava= "si";
		String devWeb ="si";
		String devCel ="si";
		
		Desarollador d = new Desarollador(nombre, devJava, devWeb, devCel );

		
		nuevoTipo.setD(d);
		nuevoTipo.Agregar();
		//Se debe imprimir El nombre Rodrigo
		// Conjunto 1 es la interseccion de los tres conjuntos.
		nuevoTipo.Conjunto1();
	}
	
	
	public void LinkedHashSet(){
		
		nuevaFabrica = new FabricaDeTipo("LinkedHashSet");
		nuevoTipo = nuevaFabrica.crearTipo();
		
		
		String nombre = "Rodrigo";
		String devJava= "si";
		String devWeb ="no";
		String devCel ="si";
		
		Desarollador d = new Desarollador(nombre, devJava, devWeb, devCel );

		
		nuevoTipo.setD(d);
		nuevoTipo.Agregar();
		//Se debe imprimir El nombre Rodrigo
		// Conjunto 1 es la interseccion de los tres conjuntos.
		nuevoTipo.Conjunto2();
		
		
	}

}
