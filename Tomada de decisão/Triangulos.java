package apostilaII;
import java.util.*;
public class Triangulos{
	public static void main (String []args ) {
    Scanner in = new Scanner (System.in);
		double soma, a, b, c;
		
		   System.out.println("Digite o primeiro valor:");
		   a = in.nextInt();
		   System.out.println("Digite o segundo valor ");
		   b = in.nextInt();
		   System.out.println("Digite o terceiro valor valor ");
		   c = in.nextInt();
		   
		   if (a + b > c && a + c > b && b + c > a) {
			   if(a == b && a == c) { 
				   System.out.println("� um tri�ngulo equilatero");
			       }else if (a == b || a == c || b == c) {
			    	   System.out.println("� um tri�ngulo isoceles");
			       }else if (a!= b && b!=c){ 
			    	   System.out.println("� um tri�ngulo escaleno");
		   } else {
			   System.out.println("N�o � um tri�ngulo");
		   }
		  in.close();
		   
	     }
			    
	 }
}

