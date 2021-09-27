package sdsd;

import java.util.HashSet;

public class Test {

    public static void main(String... sss) {

     int i=1;
     int k=1;
     
     while(i<10) {
    	  	if(i>k) {
    	  		k-=i;
    	  	}
    	  	i+=2;
     }
     System.out.println(k);
}
}