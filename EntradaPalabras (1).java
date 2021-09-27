package sucio;

import java.util.Scanner;

public class EntradaPalabras {

	
	private String palabra;

    //constructor
    public EntradaPalabras() {

        palabra="";
        pedirPalabra();
        
    }
    //metodo para pedir una entrada de teclado
    public void pedirPalabra() {

        Scanner entradaEscaner = new Scanner(System.in);
        palabra = entradaEscaner.nextLine();
    }
    
    
    public String getPalabra() {

        return palabra;
    }
}
