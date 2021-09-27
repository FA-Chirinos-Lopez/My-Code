
public class cochesPrueba{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int base_aleatorio;
		int numero_aleatorio;
		Random random = new Random();

		base_aleatorio = random.nextInt(20);
		System.out.println("Base aleatoria: "+base_aleatorio);
		for (int i=1; i<=base_aleatorio; i++){
		do
		{
		numero_aleatorio = random.nextInt(65);
		} while (numero_aleatorio<18);

		System.out.println("Números aleatorios: "+numero_aleatorio);
		}

	}

}
