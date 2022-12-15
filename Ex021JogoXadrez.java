package listaFaccat;
import java.util.Scanner;

public class Ex021JogoXadrez {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a hora do inicio da partida: ");
				int inicio = sc.nextInt();
				
				System.out.println("Digite a hora do fim da partida: ");
				int fim = sc.nextInt();
				
				if(inicio > fim){
					
					int duracao = 24 - (inicio - fim);
					System.out.println("A duração da partida foi: "+duracao+" horas");
				}
				
				else if(fim > inicio){
					
				int duracao = fim - inicio;
				System.out.println("A duração da partida foi: "+duracao+" horas");
	}
				else {
					System.out.println("A duração da partida foi: 24 horas");
				}
				
				sc.close();
				
			}
}
