package listaFaccat;

import java.util.Scanner;

public class Ex018IdadeVotar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite o ano atual: ");
				float AnoAtual = sc.nextInt();
				
				System.out.println("Digite o ano que você nasceu: ");
				float AnoNascimento = sc.nextInt();
				
				float idade = AnoAtual - AnoNascimento;
				
				if(idade<16){
					
					System.out.println("Você tem "+idade+" anos... Não poderá votar esse ano");
				}
				
				else {
					
					System.out.println("Você tem "+idade+" anos... Poderá votar esse ano");
				}
				
				sc.close();
				
			}
}
