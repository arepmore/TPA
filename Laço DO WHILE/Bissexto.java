import java.util.Scanner;
public class Bissexto {

	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int aInicial =0, aFinal =0, i=1;
		
		
		System.out.println ("Apartir de que ano voc� quer analisar? ");
		aInicial = in.nextInt();
		System.out.println ("At� que ano voc� deseja que a contagem v�?");
		aFinal = in.nextInt();
		do {
			if (aInicial % 4 == 0 )     {
				System.out.println ("O ano de " +aInicial+ " � bissexto");
			}else{}
			aInicial++;
		}while (aInicial <= aFinal);

		
}
		}
 
