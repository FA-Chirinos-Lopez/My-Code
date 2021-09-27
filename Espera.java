package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Espera {
	
	public Espera() {				//Constructor por defecto
		
	}
	
	
	public void Esperar() throws IOException { 			//Se incorpora en las opciones del menu para poder leer los datos
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" \n ____________________________________________________________________________");
		System.out.println("\n            Pulse enter para salir");			//Impide cambiar de pantalla tan rapido espera hasta que se devuelve algo
		String Espera="";
		Espera=in.readLine();
		System.out.println(Espera);
	}

}
