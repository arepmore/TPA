import java.util.Scanner;
public class Palindromo {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], i=0, j=0;
		final int TAM = 10;
		a = new int [TAM];

	//povoando o vetor A
			System.out.println("A = ");
			
			for(i =0; i<TAM; i++) {
				a[i] = in.nextInt();
			}
	
	//verifica��o
			for(i=0; i<TAM; i++) {
				if(a[i] == a[9-i]) {
					j++;
				}
			}
			if(j==10) {
				System.out.print("� um n�mero pal�ndromo");
			}else {
				System.out.print("N�o � um n�mero pal�ndromo");
			}
	  }
}
