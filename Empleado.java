
public class Empleado implements Comparable {
	

		
		
		public Empleado(String nombre,int edad, double salario) {
			
			
			this.nombre=nombre;
			this.edad=edad;
			this.sueldo=salario;
		}
		
		public String dameDatos() {
			
			return "El empleado se llama"+nombre+"- Tiene"+edad+" años. Y un salario de "+sueldo;
		}
		
		private String nombre;
		private int edad;
		private double sueldo;
		
		public int compareTo(Object miObjeto) {
		
			Empleado otroEmpleado=(Empleado) miObjeto;
			if(this.sueldo<otroEmpleado.sueldo) {
				return -1;
			}
			if(this.sueldo>otroEmpleado.sueldo) {
				return 1;
			}
			
			return 0;
		}
	}

class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, int ano,double sue ) {
		
		super(nom,ano,sue);
	}
	
	public String tomar_decisiones(String decision) {
		return "Un miembro de la dirección ha tomado la decisión de:"+decision;
	}
	
	
}



