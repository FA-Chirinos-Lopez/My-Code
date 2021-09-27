package hollo;

import java.util.Scanner;

public class EntradaPalabras {
	Scanner entradaEscaner = new Scanner(System.in);
	private String palabra;
	private int numero;

    //constructor
    public EntradaPalabras() {
    	
    }
	public void pedirNUMERO(){
		numero = 0;
		pedirNumero();
		
	}
     public void pedirPALABRA() {
        palabra="";
        pedirPalabra();
        
    }
    //metodo para pedir una entrada de teclado
     
     public void pedirNumero() {
    	 numero = entradaEscaner.nextInt();
     }
    public void pedirPalabra() {

        
        palabra = entradaEscaner.nextLine();
    }
    
    
    public String getPalabra() {

        return palabra;
    }
    
    public int getNumero() {
    	return numero;
    }

}
