package tomadadedecis�oencadeada;
import java.util.*;
public class Combustivel {
	public static void main (String []args ) {
		Scanner in = new Scanner (System.in);
		double km, capacidade, consumo;
		
		System.out.println("Digite a capacidade em litros do tanque de seu veiculo:");
		capacidade = in.nextInt();
		System.out.println("Escreva a dist�ncia percorrida:");
		km = in.nextInt();
		consumo = km/capacidade;
		
		if (consumo >= 10) {
		System.out.println("Seu carro � econ�mico");
		}else{
			System.out.println("Seu carro n�o � econ�mico");
		
		}
    }
}