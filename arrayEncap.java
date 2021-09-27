package arrayencap;
public class arrayEncap {
	int[] numArray;
	
	public arrayEncap(){
	numArray=new int[6];
	}
	public void rellenar(int i) {
		for (int e=0; numArray.length>e; e++) {
			numArray[e]=i;
		}
	}
	public void rellenar() {
		int i=0;
		int c;
		while(i!=numArray.length) {
			c=0;
			int numAle=(int) (Math.random()*49)+1;
			if(i!=0) {for (int e=0;e<i;e++) {
			if(numAle==numArray[e]) {
			c=1;}
			}
	     }if(c==0) {
	    	 numArray[i]=numAle;
	    	 i++;
	     }
	   }
	}
	public void ordenar() {
		boolean range=false;
		int limite=numArray.length-1;
		while(!range){
			int intercambios=0;
			for(int i=0;i<limite;i++) {
			if(numArray[i]>numArray[i+1]) {
					int nmovido=numArray[i];
					numArray[i]=numArray[i+1];
					numArray[i+1]=nmovido;
					intercambios++;
				}
			}
			if (intercambios==0) {
				range=true;
			}
		}
	}
	public void visualizar() {
		for (int i=0; i<numArray.length;i++) {
			System.out.println(numArray[i]);
		}
		
	}
}



