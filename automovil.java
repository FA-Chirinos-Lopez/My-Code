
public class automovil {
	
	int precio = 0;
	String marca ="";
	int numPasajeros = 0;
	
	public automovil(int pre, String mar) {
		this.precio = pre;
		this.marca = mar;
		
		System.out.println("Se creó un automovil con precio: "+ pre +" y de marca: "+ mar);
	}
	
	public automovil(int pre, String mar,int numP ) {
		
		this.precio = pre;
		this.marca = mar;
		this.numPasajeros = numP;
		
		System.out.println("Se creó un automovil con precio: "+ pre +" y de marca: "+ mar +" y puede almacenar "+ numP+" pasajeros");
		
	}
	
	public void suma() {
		
	}
	
	public void suma(int a) {
		
	}
	
	
	public void suma(int a, int b) {
		
	}

}
