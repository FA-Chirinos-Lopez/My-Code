
public class Coche {
	
	//atributos
	
	private int precio = 0;
	
	private String marca;
	
	//constructor
	
	public Coche() {
		
		System.out.println("Se ha creado un objeto coche");
		
		
	}
	
	//metodos getter
	
	public int getPrecio() {
		return this.precio;
		
	}
	
	public String getMarca() {
		return this.marca;
		
	}
	
	//metodos setter
	
	public void setPrecio(int p) {
		this.precio = p;
	}
	
	public void setMarca(String m) {
		
		this.marca = m;
	}

}
