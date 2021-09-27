package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;
import persona.mecanico;

public class ListadoMecanico {
	Vector<mecanico>listadoMecanico;
	 Scanner scan;
	//Constructor por defecto
	public ListadoMecanico() {
		listadoMecanico=new Vector<mecanico>();
		listadoMecanico.add(new mecanico("Ismael","Sanchez",23,"Chapista"));
		listadoMecanico.add(new mecanico("Hugo","Silva",24,"Pintor"));
		listadoMecanico.add(new mecanico("Maria","Duque",36,"Interiores"));
		listadoMecanico.add(new mecanico("David","Gomez",26,"Motor"));
	}
	//Metodo para añadir a lista
public void cMecanico() throws IOException{
		
		
		
		
		String _nombre="",_apellido="",_especialidad="";
		
		int _edad, opcion = 2;

		while (opcion == 2) {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
				System.out.println("Ingresa nombre : ");
				_nombre = in.readLine();
				System.out.println("Ingresa apellido : ");
				_apellido = in.readLine();
				System.out.println("Ingresa edad : ");
				_edad = Integer.parseInt(in.readLine());
				System.out.println("Ingresa tipo especialidad : ");
				_especialidad = in.readLine();
				System.out.println("Datos del vehiculo:");
				System.out.println(_nombre + " " + _apellido + " " + _edad + " " + _especialidad);
				System.out.println("Son los datos correctos?\n1.Si\n2.No, introducir de nuevo los datos");
				opcion = Integer.parseInt(in.readLine());
				if(opcion == 1) {
			    listadoMecanico.add(new mecanico(_nombre,_apellido,_edad,_especialidad));
			    }
		}}
//for-each
public void verMecanicos() {

	for(mecanico e: listadoMecanico) {
		System.out.println("___________________________________________");
	e.dameDatos();
	
}}

         public void aumentoSueldo()  {
        	 double aumento;
        	scan=new Scanner(System.in);
        	 System.out.println("Introduzca aumento: ");
        	 aumento=scan.nextDouble();
        	 for(mecanico e:listadoMecanico) {
        			e.setsAumento(aumento);
        			
        	}System.out.println("Los salarios han sido aumentados en: "+aumento);
        	 
         }
         
         
         //Metodo para buscar en lista
         public void bEspecialidad() throws NumberFormatException, IOException {
       		boolean limitador = false;
       		String BEspecialidad;
       		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       		System.out.println("Ingrese especialidad: ");
       		BEspecialidad=in.readLine();
       		
       		for (mecanico e : listadoMecanico) {
       			String Especialidad;
       			Especialidad=e.getEspecialidad();
       		
       			if (BEspecialidad == Especialidad ){
       				System.out.println("___________________________________________");
       				e.dameDatos();
       				limitador=true;
       				
       		}
       		
       	}if(limitador==false) {
       		System.out.println("No se han encontrado coincidencias.");
       		
       	}
       	
       	}
         
         

}
