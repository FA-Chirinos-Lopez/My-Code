package uso_array;

import java.util.Scanner;

public class cochecitos {
	Scanner scan = new Scanner(System.in);
	String marca;
	String modelo;
	int precio;
	
	public cochecitos() {
		
	}
	
	public String dameDatos() {
		
		return "Marca:"+marca+" Modelo:"+modelo+" Precio:"+precio;
	}
	
	public cochecitos(String _marca,String _modelo, int _precio) {
		
		this.marca = _marca;
		this.modelo = _modelo;
		this.precio = _precio;
		
		
		
	}
	
         public cochecitos(String _nuevo) {
		
		
		
		System.out.println("Inserte marca del vehiculo ligero: ");
		this.marca = scan.nextLine() ;
		
		System.out.println("Inserte modelo del vehiculo ligero: ");
		this.modelo = scan.nextLine();
		
		
		
		System.out.println("Inserte precio  del vehiculo ligero: ");
		this.precio = scan.nextInt();
         }
	

}
