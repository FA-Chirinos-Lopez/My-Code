package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import menus.menuVehiculos;
import vehiculos.ligeros;

public class ListadoLigeros extends ligeros {
	menuVehiculos irMV=new menuVehiculos();
	
	//=new ArrayList<ligeros>();
	String marca ="";
	String modelo="";
	String matricula="";
	int nOcupantes;
	int precio;
	//ArrayList<ligeros> listaLigeros=new ArrayList<ligeros>();
	
	
	public ListadoLigeros(int _E) {
		//listaLigeros=new ArrayList<ligeros>();
		//listaLigeros.add(new ligeros(marca,modelo,matricula,nOcupantes,precio));
	}
	public static void inicio() {
		ArrayList<ligeros> listaLigeros=new ArrayList<ligeros>();
		listaLigeros.add(new ligeros("Mercedes","34","32432i",5,43432));
		listaLigeros.add(new ligeros("Alfa Romeo","147","348u",4,4324));
		listaLigeros.add(new ligeros("Opel","Corsa","0012",4,600));
		listaLigeros.add(new ligeros("BMW","318TDS","0098Y",5,3000));
		for(ligeros e: listaLigeros) {
			System.out.println(e.dameDatos());
		}
	}
	
	public ListadoLigeros() {
		
	}
	public void cligero() {
		
		/*String marca ="";
		String modelo="";
		String matricula="";
		int nOcupantes;
		int precio;*/
		
	
	BufferedReader in  = new BufferedReader (new InputStreamReader(System.in));
	try {
	
	for(int i = 0;i<1;i++) {
		System.out.println("Ingresa matricula "+i+": ");
		matricula= in.readLine();
		System.out.println("Ingresa marca "+i+": ");
		marca= in.readLine();
		System.out.println("Ingresa modelo "+i+": ");
		modelo= in.readLine();
		System.out.println("Ingresa nº ocupantes "+i+": ");
		nOcupantes=Integer.parseInt(in.readLine());
		System.out.println("Ingresa precio "+i+": ");
		precio=Integer.parseInt(in.readLine());
		
		
		//listaLigeros.add(new ligeros(marca,modelo,matricula,nOcupantes,precio));
	}
	}catch(Exception e) {
		
	}
	for(ligeros e: listaLigeros) {
		System.out.println(e.dameDatos());
	}
	irMV.menu_Vehiculos();
}
	
	public void verLigeros() {
		
		for(ligeros e: listaLigeros) {
			System.out.println(e.dameDatos());
	}
		irMV.menu_Vehiculos();
	
}
	
}