package vehiculos;

import java.util.ArrayList;

public class ligeros extends vehiculo {
	
	private int numeroOcupantes;
	public int getNumeroOcupantes() {
		return numeroOcupantes;
	}

	public void setNumeroOcupantes(int numeroOcupantes) {
		this.numeroOcupantes = numeroOcupantes;
	}
	ArrayList<ligeros> listaLigeros=new ArrayList<ligeros>();
	public ligeros() {
		
	}
	
	public ligeros(String _marca, String _modelo, String _matricula, int _nOcupantes,int _precio) {
		this.setMarca(_marca);
		this.setModelo(_modelo);
		this.setMatricula(_matricula);
		//this.setNumeroOcupantes(_nOcupantes);
		this.setPrecio(_precio);
		

	}
	public String dameDatos() {
		
		return "Matricula: "+getMatricula()+ "Marca: "+getMarca()+" Modelo: "+getModelo()+" Numero Ocupantes: "+getNumeroOcupantes()+" Precio: "+getPrecio();
	}
	
	}
	
	
		
		


