import java.util.Scanner;
public class RotinaBusca {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[], b=0, i, ii, r=0;
		final int TAM = 10;
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira um n�mero:");
			a[i] = input.nextInt();
		}
		
		System.out.println("   ");
		
		for(ii=0; ii<TAM; ii++) {
			System.out.println("Entre com o n�mero que ser� buscado:");
			b = input.nextInt();
			
			for(i=0, ii=0; i<TAM; i++, ii++) {
				if(a[i]==b) {
					r = 1;
					
				}
			}
		}
		
		System.out.println("   ");
		
		if(r==1) {
			
			System.out.println("O n�mero "+b+" est� dentro do vetor");
			
		}else{
			
			System.out.println("O n�mero "+b+" n�o est� dentro do vetor");
		}
	}
}
