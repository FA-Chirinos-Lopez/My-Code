import java.util.*;

public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cliente cl1=new cliente("Antonio Banderas","00001",200000);
		cliente cl2=new cliente("Eduardo Moniga","00002",700000);
		cliente cl3=new cliente("Samuel Lopez","00003",60000);
		cliente cl4=new cliente("Penelope Cruz","00004",500000);
		
		Set<cliente> clientesBanco=new HashSet<cliente>();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		
		for (cliente cliente : clientesBanco) {
			
			System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()+" "+cliente.getSaldo());
		
		}

	}

}
