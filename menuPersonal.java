package menus;

import java.util.Scanner;

import util.recolectorBasura;

public class menuPersonal {
	
	public void menu_Personal() {
		menuBienvenida entrada = new menuBienvenida();
		recolectorBasura recolectar = new recolectorBasura();
		Scanner scan=new Scanner(System.in);
		int opc;
		
		do {
		System.out.println("\n \n \n \n \n \n \n \n \n");
		
		
		
		System.out.println("1_ Listado de personal Mecánico.");
		System.out.println("2_ Listado de Personal Conductor.");
		System.out.println("3_ Buscar Personal mecánico por Puesto.");
		System.out.println("4_ Buscar Personal Conductor por carnet.");
		System.out.println("5_ Añadir Personal Conductor.");
		System.out.println("6_ Añadir Personal Mecánico.");
		System.out.println("7_ Subir el salario del Personal Conductor.");
		System.out.println("8_ Subir el salario del Personal Mecánico.");
		System.out.println("9_ Salir");
		
		System.out.println("Selecciones una opción:");
		
		opc = scan.nextInt();
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \\n \n \n \n");
	}while(opc < 1 || opc>9);
		
		switch(opc) {
		
		    case 1:  //Listado de personal Mecánico.
			
			    break;  
			
		    case 2: //Listado de Personal Conductor.
		    	
		    	break;
		    case 3:     //Buscar Personal mecánico por Puesto.
		    	
		    	break;
		    case 4:  //Buscar Personal Conductor por carnet.
		    	
		    	
		    	break;
		    	
		    case  5:         //Añadir Personal Conductor.
		    
		    
		    break;
		    
		    case 6:   //Añadir Personal Mecánico.
		    	
		    	break;
		    	
		    case 7:  //Subir el salario del Personal Conductor.
		    	
		    	
		    	break;
		    	
		    case 8:  //Subir el salario del Personal Mecánico.
		    	
		    	
		    	break;
		    
		    
		    case 9:  //salir
		    	
		    	
		    	entrada.Bienvenidaa();
		    	recolectar.recolectar();
		    	
		    	break;
		    	
		    	
		    	
		    	
		    
			
		
			
			
			
		
		
		
		}
	
	
		
	}

}
