package menus;







import java.util.Scanner;

import util.ListadoLigeros;
import util.recolectorBasura;





public class menuVehiculos {
	
	
	
	
	
	public void menu_Vehiculos() {
		
			
		recolectorBasura recolectar = new recolectorBasura();
		menuBienvenida entrada = new menuBienvenida();
		int opc;
		Scanner scan=new Scanner(System.in);
		ListadoLigeros lLigeros=new ListadoLigeros();
		
		
		
		
		
		
		do {
			
		System.out.println("\n  ");
		
		
		System.out.println("1_ Listado de Vehículos");
		System.out.println("2_ Agregar Vehículo Ligero");
		System.out.println("3_ Agregar Vehículo Furgoneta");
		System.out.println("4_ Buscar Vehículo Ligero por ocupantes");
		System.out.println("5_ Buscar Vehículo Furgoneta por carga");
		System.out.println("6_ Salir");
		
		
		System.out.println("Seleccione una opción:");
		
		opc = scan.nextInt();
		
		
		
		
		System.out.println("\n \n  \n  \n  \n \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  ");
		
		}while(opc < 1 || opc>6);
		
		switch(opc) {
		
		case 1:  //Listado de Vehículos
			
            lLigeros.verLigeros();
		
			
		case 2:  //Agregar hacer Vehículo Ligero
			
			
				lLigeros.cligero();		
			ListadoLigeros New=new ListadoLigeros(4);
		
			
			
			break;
		
			
		case 3: //Agregar Vehículo Furgoneta
			
			
		       
	        
	        
	        	 
	        	
			break;
			
		case 4:  //Buscar Vehículo Ligero por ocupantes
			
			
			break;
			
			
		case 5:   //Buscar Vehículo Furgoneta por carga
			
			
			break;
			
			
		case 6:  //Salir.
			
			
			recolectar.recolectar();
			entrada.Bienvenidaa();
	    	
	    	
	    	
	    	break;
			
			
			
			
		}
	
		
	
	}	

}
