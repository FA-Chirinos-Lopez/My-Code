import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		
		
		
		
		System.out.println("Ingresa el primer numero:");
		numero1 = scan.nextInt();
		
		System.out.println("Ingresa el segundo numero: ");
		
		numero2 = scan.nextInt();
		
		System.out.println(numero2);
		
		//Solucitar operaci�n
		
		int opc;
		
		System.out.println("Ingresa la operacion que necesitas realizar");
		System.out.println("1-Suma");
		System.out.println("2-Resta");
		System.out.println("3-Multiplicaci�n");
		System.out.println("4-Divisi�n");
		
		
		opc = scan.nextInt();
		
		switch(opc) {
		
		case 1:
			double suma = numero1 + numero2;
			System.out.println("La suma del numero "+numero1+" mas el numero "+numero2+" es "+suma);
			
			break;
		case 2:
			double resta = numero1 - numero2;
			System.out.println("La resta del numero "+numero1+" menos el numero "+numero2+" es "+resta);
			
			break;
		case 3:
			double multiplicacion = numero1 * numero2;
			System.out.println("La multiplicaci�n del numero "+numero1+" por el numero "+numero2+" es "+multiplicacion);
			
			break;
			
		case 4:
			double division = numero1 / numero2;
			System.out.println("La divisi�n del numero "+numero1+" entre el numero"+numero2+" es "+division);
			
			break;
			
			default:
				System.out.println("La operacion seleccionada es INCORRECTA");
				break;
			
			
		
		}

	}

}
