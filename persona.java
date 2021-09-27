package persona;

public abstract class persona {
	
	String Nombre;
	String Apellido;
	int Edad;
	
	   public String getNombre()
       {
               return Nombre;
       }
       public void setNombre(String Nombre)
       {
               this.Nombre = Nombre;
       }

       public String getApellido()
       {
               return Apellido;
       }
       public void setApellido(String Apellido)
       {
               this.Apellido = Apellido;
       }
       public int getEdad()
       {
               return Edad;
       }
       public void setEdad(int Edad)
       {
               this.Edad = Edad;
       }



}	
