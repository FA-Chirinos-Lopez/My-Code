package pruebaInternet;

import java.util.ArrayList;

public class ListaCantantesFamosos {
   
    private String nombreListaCantantes;
    private ArrayList<String> listaCantantes;
   
    //constructor
    public ListaCantantesFamosos () {
       
        nombreListaCantantes = "CANTANTES FAMOSOS";
        listaCantantes = new ArrayList<String>();
        listaCantantes.add("Paulina Rubio");
        listaCantantes.add("Shakira");
        listaCantantes.add("Beyonce");
    }
   
    public void aņadirNombre (String nombreCantante) {
       
        listaCantantes.add(nombreCantante);
    }
   
    public ArrayList<String> getListaCantantes() {
       
        return listaCantantes;
    }
   
    public int getTamaņo() {
       
        return listaCantantes.size();
    }
   
    public String getNombreLista() {
       
        return nombreListaCantantes;
    }
   
    //Con este metodo se imprime la lista en pantalla en formato columna
    public void imprimirLista () {
       
        System.out.println("\n" + getNombreLista() + "\n");
        for (int i=0; i<getTamaņo(); i++) {
            System.out.println((i+1) + " --- " + getListaCantantes().get(i));
        }
    }
}