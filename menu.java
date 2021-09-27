package hollo;



public class menu {
	
	
	
	int opc2;
	listacoche marcascoches=new listacoche();
	EntradaPalabras marca=new EntradaPalabras();
	
	public menu() {
		
	}
	
	public menu(int _p) {
		
		
		
	}
	
	
	public void menucrear() {
		
		
		
		
		do {
			
			System.out.println("1_ crear");
			System.out.println("2_ mostrar");
			System.out.println("3_ Salir");
			System.out.println("Escoja una opción: ");
			marca.pedirNUMERO();
			opc2 = marca.getNumero();
		      }while(opc2 < 1 || opc2>3);
		      switch(opc2) {
		      
		      case 1:
		    	 
		    	  marcascoches.añadirMarca(marca.getPalabra());
		    	  
		    	  
		    	  break;
		    	 
		      case 2:
		    	  
		    	  //marcascoches.imprimirLista();
		    	  
		    	  break;
		       }
		
	}

}
