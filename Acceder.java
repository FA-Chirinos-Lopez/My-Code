package acceso;


import java.util.Scanner;

import menus.menuBienvenida;



public class Acceder {
	
	public void ingresar() {

	Scanner scan=new Scanner(System.in);
	Usuarios user1 = new Usuarios();
	menuBienvenida entrada = new menuBienvenida();
	
	
	
		// TODO Auto-generated method stub
		//incorporamos el scanner
		
		
		//Definimos variables 
		
		String usuarioDado = "" ;
		String contrase�aDada = "";
		
		//llave
		boolean llave = false;
	
		
		//Se crea usuario
		
		
		user1.setUsuario("Lopez");
		user1.setContrase�a("Antonio");
		
		
		do {
		    
			
			
					
			System.out.println("Introduzca Usuario:");
			
			usuarioDado = scan.nextLine();
			System.out.println("Introduzca contrase�a");
			
			contrase�aDada = scan.nextLine();
			if (usuarioDado .equals(user1.getUsuario()) && contrase�aDada .equals(user1.getContrase�a()) ) {
				llave = true;
			}
			
				System.out.println(llave);
			
		}while(llave != true);
		
		System.out.println("Acaba de entrar al sistema");
		
		
		
		
		entrada.Bienvenidaa();
			
		
		
		
		
		
		

	}

	
}

