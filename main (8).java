import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroRepeticiones = 0;
		ArrayList numeros = new ArrayList();


		for(double contador = Math.floor(Math.random()*(1-20+1)+20); contador > 0; contador--) {

		double valorDouble = Math.floor(Math.random()*(18-65+1)+65);
		int numeroAleatorio = (int)valorDouble;

		numeroRepeticiones++;
		numeros.add(numeroAleatorio);



		
		}
		System.out.println("Se han dado: "+numeroRepeticiones+" numeros aleatorios todos ellos comprendidos entre el 18 y el 65");
		System.out.println(numeros);

	}

}
