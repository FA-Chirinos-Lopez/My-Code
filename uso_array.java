package uso_array;
import java.util.*;
import java.util.List;
import java.util.Scanner;

public class uso_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//cochecitos e = new cochecitos();
		
		
		
		
		
		
		/*cochecitos[] listacochecitos = new cochecitos[50];
		
		
		System.out.println("Inserte numero vehiculo: ");
		listacochecitos[scan.nextInt()]=new cochecitos("nuevo");
		
		System.out.println(listacochecitos.length);*/
		
		
		
		ArrayList<cochecitos> listaCochecitos=new ArrayList<cochecitos>();
		
		listaCochecitos.add(new cochecitos("nuevo"));
		
		for(cochecitos e: listaCochecitos) {
			System.out.println(e.dameDatos());
		
		}

	}

}
