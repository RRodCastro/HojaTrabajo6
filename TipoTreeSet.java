import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;


public class TipoTreeSet extends TiposDeSet {
	
	
	public static TreeSet <Desarollador>  desarollador = new TreeSet <Desarollador>();

	
	public TipoTreeSet(){
		super();
	}
	
	
	public void Agregar (){
		
		
		desarollador.add(getD());
		
		
		
	}
	
	
public void Conjunto1(){
		
		for (Desarollador d: desarollador){
			String devWeb = d.getDevWeb();
			String devJava = d.getDevJava();
			String devCel = d.getDevCel();
			
			if ((devWeb.equalsIgnoreCase("si")) &&  (devJava.equalsIgnoreCase("si") && (devCel.equalsIgnoreCase("si")) )) {
				
				System.out.println("Nombre: "+ d.getNombrePersona());
				
				
			}
			
			
			
		}
	}
	
	public void Conjunto2(){
		
		
		for (Desarollador d: desarollador){
			String devWeb= d.getDevWeb();
			String devJava = d.getDevJava();
			
			if (devJava.equalsIgnoreCase("si") && (devWeb.equalsIgnoreCase("no"))){
				System.out.println("Nombre: " +d.getNombrePersona());
			}
		}
	}
	
	
	public void Conjunto3(){
		
		for (Desarollador d: desarollador){
			String devWeb = d.getDevWeb();
			String devJava = d.getDevJava();
			String devCel = d.getDevCel();
			
			if ((devWeb.equalsIgnoreCase("si")) &&  (devJava.equalsIgnoreCase("no") && (devCel.equalsIgnoreCase("si")) )) {
				
				System.out.println("Nombre: "+ d.getNombrePersona());
				
				
			}
			
			
			
		}
		
	}
	
	
	public void Conjunto4(){
		
		for (Desarollador d: desarollador){
			String devWeb = d.getDevWeb();
			String devJava = d.getDevJava();
			String devCel = d.getDevCel();
			
			if ((((devWeb.equalsIgnoreCase("si")) ||  (devCel.equalsIgnoreCase("si"))) && (devJava.equalsIgnoreCase("no")) )) {
				
				System.out.println("Nombre: "+ d.getNombrePersona());
				
				
			}
			
			
			
		}
		
	}
	
	public void Conjunto5(){
		
		//Defincion Subconjunto:
		// Todo Elemento de conjunto desarolladores Java es tambien 
		//elemento de conjunto desarolladores Web
		//Todo elemento que sea developer Java tiene que ser un developer en Web
		
		//Creacion de tres subconjuntos
		TreeSet <String>  devJava = new TreeSet <String>();
		TreeSet<String> devCel = new TreeSet <String>();
		TreeSet<String> devWeb = new TreeSet <String>();

		
		
		for (Desarollador d: desarollador){
			String Web = d.getDevWeb();
			String Java = d.getDevJava();
			String Cel = d.getDevCel();
					
			if (Web.equalsIgnoreCase("si") ){
				
				devWeb.add(d.getNombrePersona());
				
				
			}
			
			if (Java.equalsIgnoreCase("si")){
				devJava.add(d.getNombrePersona());
				
			}
			
			if ( Cel.equalsIgnoreCase("si") ){
				devCel.add(d.getNombrePersona());
				
			}
			
		}
				
		
			}
	
	public void conjuntoMayor(){
		
		TreeSet <String>  devJava = new TreeSet <String>();
		TreeSet<String> devCel = new TreeSet <String>();
		TreeSet<String> devWeb = new TreeSet <String>();
		

		for (Desarollador d: desarollador){
			String Web = d.getDevWeb();
			String Java = d.getDevJava();
			String Cel = d.getDevCel();
					
			if (Web.equalsIgnoreCase("si") ){
				
				devWeb.add(d.getNombrePersona());
				
				
			}
			
			if (Java.equalsIgnoreCase("si")){
				devJava.add(d.getNombrePersona());
				
			}
			
			if ( Cel.equalsIgnoreCase("si") ){
				devCel.add(d.getNombrePersona());
				
			}
			
		}
		
		int numJava = devJava.size();
		int numWeb = devWeb.size();
		int numCel = devCel.size();
		
		if (( numJava > numWeb) && (numJava > numCel)){
			System.out.println("Desarolladores de Java");

			System.out.println("Cantidad: " +numJava );
			System.out.println("Miembros (sin ordenar)");
			System.out.println(devJava);
			
			List <String> sortedList = new ArrayList <String> (devJava);
			Collections.sort(sortedList );
			System.out.println("Miembros (orden ascedente)");
			System.out.println(sortedList);
			
			
		}
		
		if (( numWeb > numJava) && (numWeb > numCel)){
			
			System.out.println("Desarolladores de Web");

			System.out.println("Cantidad: " +numWeb );
			System.out.println("Miembros (sin ordenar)");

			System.out.println(devCel);
			
			List <String> sortedList = new ArrayList <String> (devWeb);
			Collections.sort(sortedList );
			System.out.println("Miembros (orden ascedente)");
			System.out.println(sortedList);
			
		}
		
		
		if (( numCel > numJava) && (numCel > numWeb)){
			System.out.println("Desarolladores de Celulares");
			System.out.println("Cantidad: " +numCel );
			System.out.println("Miembros (sin ordenar)");

			System.out.println(devWeb);
			
			List <String> sortedList = new ArrayList <String> (devCel);
			Collections.sort(sortedList );
			System.out.println("Miembros (orden ascedente)");
			System.out.println(sortedList);
			
		}
	}
			
	
	}
	
	
	
	
	
		
		
		
		




	
	
	
	


