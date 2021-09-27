import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Empleado listaEmpleados[]=new Empleado[10];
		
		listaEmpleados[1]=new Empleado(" jose",34,9797);
		
		listaEmpleados[2]=new Empleado(" jose",23,3000);
		listaEmpleados[3]=new Empleado(" Laura",27,2500);
		
		listaEmpleados[4]=new Empleado(" Ana", 47, 43225);
		
		listaEmpleados[5]=new Empleado(" Rachel",43,4324);
		
		listaEmpleados[6]=new Empleado(" Diana",35,4322);
		
		listaEmpleados[7]=new Empleado(" Isa",25,4356);
		
		listaEmpleados[8]=new Empleado(" Ramon",40,5478);
		
		listaEmpleados[0]=new Empleado(" Jose",24,2500);
		listaEmpleados[9]=new Jefatura(" jose",34,9797);
		Jefatura jefa_Finanzas=(Jefatura) listaEmpleados[9];
		/*listaEmpleados.add(new Empleado(" jose",23,3000));
		listaEmpleados.add(new Empleado(" Laura",27,2500));
		
		listaEmpleados.add(new Empleado(" Ana", 47, 2500));
		
		listaEmpleados.add(new Empleado(" Rachel",43,2500));
		
		listaEmpleados.add(new Empleado(" Diana",35,2500));
		
		listaEmpleados.add(new Empleado(" Isa",25,2500));
		
		listaEmpleados.add(new Empleado(" Ramon",40,2500));
		
		listaEmpleados.add(new Empleado(" Jose",24,2500));
		listaEmpleados.set(1, new Empleado(" Felix",22,0));*/
		//System.out.println(listaEmpleados.get(5).dameDatos());
		//System.out.println(listaEmpleados.size());
		
		System.out.println(jefa_Finanzas.tomar_decisiones("TODOS DESPEDIDOS"));
		Arrays.sort(listaEmpleados);
		
		System.out.println();
		for(Empleado e: listaEmpleados) {
		System.out.println(e.dameDatos());	}
		
		
		
		/*for(int i=0;i<listaEmpleados.size();i++) {
			Empleado e=listaEmpleados.get(i);
			System.out.println(e.dameDatos());
		}*/

	}
	
 
}
