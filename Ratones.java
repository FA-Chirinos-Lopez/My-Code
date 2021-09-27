
public class Ratones extends Thread{
	static int Plato=100;
	private int Estomago;
	private String nomRaton;
	
	/*****
	 * @author <Felixchirinoslopez@gmail.com>
	 *
	 *****/ 

	
	
	public Ratones(int _Estomago, String _nombre) { //constructor
		Estomago=_Estomago;
		nomRaton=_nombre;
	} 
	synchronized public void comer() throws InterruptedException { //metodo comer
		Thread.sleep(1000);
		System.out.println(nomRaton+" esta comiendo.");
		Plato-=Estomago;
		System.out.println("Plato= "+Plato);
	}
	synchronized public void llenar() throws InterruptedException { //metodo llenar
		Thread.sleep(1000);
		
		Plato=100;
	}
	public void run() { //metodo run
		int contador=0;
		while(true) {
			if (Estomago<=Plato) {//preguntamos si hay comida suficiente en el plato
				try {
					comer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				contador++;
	
			}else { //Si no hay comida suficiente se llena
				try {
					llenar();
					System.out.println("El plato se esta llenando.");
				} catch (InterruptedException e) {
					e.printStackTrace();
			}
	    }
			if(contador==10) {  // contador del ciclo
				break;
			}
	  }
	}
	public static void main(String[] args) throws InterruptedException {
		new Ratones(10,"Cerebro").start();  //Proceso en paralelo
		Thread.sleep(4000);                 //Pequeño delay para que no comiencen al mismo tiempo
		new Ratones(5,"Pinky").start();     //Proceso en paralelo
	}
}
