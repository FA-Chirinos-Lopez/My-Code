package vehiculos;

import java.util.Scanner;

public class ligeros extends vehiculo {
	
	int numeroOcupantes ;
	
	
	
     //Getters y Setters
	public int getNumeroOcupantes() {
		return numeroOcupantes;
	}

	public void setNumeroOcupantes(int numeroOcupantes) {
		this.numeroOcupantes = numeroOcupantes;
	}
	
	//Metodo constructor
	public ligeros() {
		
	}
	
	public ligeros(String _marcaLigeros, String _modeloLigeros,int _numeroOcupantesLigeros,int _precioLigeros) {
		
		this.marca = _marcaLigeros;
		this.modelo = _modeloLigeros;
		this.numeroOcupantes = _numeroOcupantesLigeros;
		this.precio = _precioLigeros;
		
	}
	
	public ligeros(String _nuevo) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserte matricula del vehiculo ligero:");
		this.matricula = scan.nextLine();
		
		System.out.println("Inserte marca del vehiculo ligero: ");
		this.marca = scan.nextLine() ;
		
		System.out.println("Inserte modelo del vehiculo ligero: ");
		this.modelo = scan.nextLine();
		
		System.out.println("Inserte numero de ocupantes del vehiculo ligero:");
		this.numeroOcupantes = scan.nextInt();
		
		System.out.println("Inserte precio  del vehiculo ligero: ");
		this.precio = scan.nextInt();
		
	}
		//volcarLista
		
	
	public String dameDatos() {
		
		
		return  "ID: "+this.matricula+"-" +this.marca+"-"+this.modelo+" Precio:"+this.precio+"€ nºOcupantes"+this.numeroOcupantes;

	}
		
	}
		