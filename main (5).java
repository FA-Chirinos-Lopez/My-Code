import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Arraylist
		 * Stack
		 * Queue
		 * HashTable
		 */
		//ArrayList:
		 
		ArrayList datos = new ArrayList(50);
		
		//insertar datos:
		
		datos.add(5);
		datos.add(10);
		int x = 100;
		datos.add(x);
		
		for(int i = 0; i<10 ; i++) {
			
			datos.add(i+1);
		}
		
		System.out.println(datos);
		//recuperar tamaño de arraylist
		
		System.out.println(datos.size());
		
		//Stack-Pila (Last in First out)
		//Push : insertar elementos en la parte posterior de la pila 
		//Pop : eliminar elementos(eliminara el ultimo elemento añadido al stack)
		
		Stack miPila = new Stack();
		miPila.push("Lola");
		miPila.push("Carmen");
		miPila.push("La Mona Lisa");
		miPila.push("El Quijote");
		
		//miPila.clear();//Limpiar el stack vaciarla
		
		String elemento;
		elemento = (String)miPila.pop();
		
		System.out.println(elemento);
		
		
		//Queu-cola(LIFO: Last in first out)
		//add : añadir elementos a la queu
		//poll : eliminar el ultimo elemento añadido
		//peek : consulta ultimo elemento añadido a la cola
		
		Queue cola = new LinkedList();
		
		cola.add(5);
		cola.add(10);
		cola.add(15);
		
		System.out.println(cola.poll());
		System.out.println(cola);
		
		//HashTable
		
		
		Hashtable tabla = new Hashtable();
		//Hashtable<Integer, String> tabla2 = new Hashtable();
		tabla.put(1, "Apple");
		tabla.put(2, "Sony");
		tabla.put(6, "Samsung");
		tabla.put("ferrari", 400);
		
		System.out.println(tabla.get("ferrari"));
		
		
		
		
		
		
		
		
		

	}

}
