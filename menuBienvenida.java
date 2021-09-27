package menus;

import java.util.Scanner;

import util.recolectorBasura;


public class menuBienvenida {
	
	
	public void Bienvenidaa() {
		menuPersonal entrarPersonal =new menuPersonal ();
		menuVehiculos entradaVehiculos =new menuVehiculos ();
		recolectorBasura recolectar = new recolectorBasura();
		Scanner scan=new Scanner(System.in);
		
		int opc;
		
		do {
			
			
			
		System.out.println("\n \n \n \n \n \n \n \n \n");
		
		
		System.out.println("1_ Gestión Personal.");
		System.out.println("2_ Gestión Vehículos.");
		System.out.println("3_ Salir.");
		
		System.out.println("Seleccione una opción:");
		
		opc = scan.nextInt();
		
		System.out.println("\n \n  \n  \n  \n \n  \n  \n  \n  \n  \n  \n  \n  \n  \n  ");
		
	}while(opc < 1 || opc>3);
		
		switch(opc) {
		
		case 1:
			
			entrarPersonal.menu_Personal();
			
			
			break;
			
		case 2:
			
			entradaVehiculos.menu_Vehiculos();
			
			break;
			
		case 3:
			
			
			recolectar.recolectar();
			
			break;
			
			
		}
		
	}
}
