package listaFaccat;

import java.util.Scanner;

public class Ex018IdadeVotar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite o ano atual: ");
				float AnoAtual = sc.nextInt();
				
				System.out.println("Digite o ano que voc� nasceu: ");
				float AnoNascimento = sc.nextInt();
				
				float idade = AnoAtual - AnoNascimento;
				
				if(idade<16){
					
					System.out.println("Voc� tem "+idade+" anos... N�o poder� votar esse ano");
				}
				
				else {
					
					System.out.println("Voc� tem "+idade+" anos... Poder� votar esse ano");
				}
				
				sc.close();
				
			}
}
