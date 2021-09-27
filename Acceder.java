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
		String contraseñaDada = "";
		
		//llave
		boolean llave = false;
	
		
		//Se crea usuario
		
		
		user1.setUsuario("Lopez");
		user1.setContraseña("Antonio");
		
		
		do {
		    
			
			
					
			System.out.println("Introduzca Usuario:");
			
			usuarioDado = scan.nextLine();
			System.out.println("Introduzca contraseña");
			
			contraseñaDada = scan.nextLine();
			if (usuarioDado .equals(user1.getUsuario()) && contraseñaDada .equals(user1.getContraseña()) ) {
				llave = true;
			}
			
				System.out.println(llave);
			
		}while(llave != true);
		
		System.out.println("Acaba de entrar al sistema");
		
		
		
		
		entrada.Bienvenidaa();
			
		
		
		
		
		
		

	}

	
}

