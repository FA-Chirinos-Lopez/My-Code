import java.util.Scanner;

public class DNI {


	public static void main(String[] args) throws InterruptedException {
Scanner scan=new Scanner(System.in);
		
		
		char [] miArray=new char[] {'T','R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		int nDNI;
		System.out.println("Ingrese su numero de DNI: ");
		nDNI=scan.nextInt();
		int nl=(nDNI%23);
		System.out.println("Su DNI completo seria: "+nDNI +miArray[nl]);
		
		
scan.close();
	}
	
	

}
