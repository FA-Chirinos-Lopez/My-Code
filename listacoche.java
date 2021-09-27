package hollo;
import java.util.ArrayList;

public class listacoche {
	    String _marca_;
	    int Tlista;
	    private String nombreListaMarcas;
	    ArrayList <coche> cochel=new ArrayList<coche>();
	    menu abrir=new menu();
	    //constructor
	   
	    
	    public listacoche () {
	    	
	    }
	    
	     public void crearlista() {  
	        nombreListaMarcas = "Marcas de coches.";
	        //cochel=new ArrayList<coche>();
	        cochel.add(new coche("Alfa"));
	        cochel.add(new coche("Mercedes"));
	        cochel.add(new coche("Citroen"));
	    }
	   
	    public void añadirMarca (String nombreMarca) {
	       
	        cochel.add(new coche (nombreMarca));
	        abrir.menucrear();
	    }
	   
	    /*public ArrayList<coche> getListaCantantes() {
	       
	    	cochel = _marca_ ;
	    	
	        return _marca_;
	    }*/
	   
	    public int getTamaño() {
	        Tlista = cochel.size();
	        return Tlista;
	    }
	   
	    public String getNombreLista() {
	       
	        return nombreListaMarcas;
	    }
	   
	    //Con este metodo se imprime la lista en pantalla en formato columna
	    public void imprimirLista () {
	       
	        System.out.println("\n" + getNombreLista() + "\n");
	        for (int i=0; i<getTamaño(); i++) {
	            System.out.println((i+1) + " --- " + cochel.get(i));
	            abrir.menucrear();
	        }
	    }
}
