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
		
		
		System.out.println("1_ Listado de Veh�culos");
		System.out.println("2_ Agregar Veh�culo Ligero");
		System.out.println("3_ Agregar Veh�culo Furgoneta");
		System.out.println("4_ Buscar Veh�culo Ligero por ocupantes");
		System.out.println("5_ Buscar Veh�culo Furgoneta por carga");
		System.out.println("6_ Salir");
		
		
		System.out.println("Seleccione una opci�n:");
		
		opc = scan.nextInt();
		
		
		
		
		System.out.println("\n \n  \n  \n  \n \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  ");
		
		}while(opc < 1 || opc>6);
		
		switch(opc) {
		
		case 1:  //Listado de Veh�culos
			
            lLigeros.verLigeros();
		
			
		case 2:  //Agregar hacer Veh�culo Ligero
			
			
				lLigeros.cligero();		
			ListadoLigeros New=new ListadoLigeros(4);
		
			
			
			break;
		
			
		case 3: //Agregar Veh�culo Furgoneta
			
			
		       
	        
	        
	        	 
	        	
			break;
			
		case 4:  //Buscar Veh�culo Ligero por ocupantes
			
			
			break;
			
			
		case 5:   //Buscar Veh�culo Furgoneta por carga
			
			
			break;
			
			
		case 6:  //Salir.
			
			
			recolectar.recolectar();
			entrada.Bienvenidaa();
	    	
	    	
	    	
	    	break;
			
			
			
			
		}
	
		
	
	}	

}
