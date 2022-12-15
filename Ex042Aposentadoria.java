package listaFaccat;

import java.util.Scanner;

public class Ex042Aposentadoria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do empregado:");
		int codigo = sc.nextInt();
		
		System.out.println("Digite o ano do seu nascimento:");
		int nascimento = sc.nextInt();
		
		System.out.println("Digite o ano de ingreso na empresa:");
		int ingresso = sc.nextInt();
		
		int idade = 2022 - nascimento;
		int AnosEmpresa = 2022 - ingresso;
		
		if(idade >= 65){
			
			System.out.println("Requerer aposentadoria");
		}
		
		else if(AnosEmpresa >= 30){
			
			System.out.println("Requerer aposentadoria");
		}
		
		else if(idade >= 60 && AnosEmpresa >= 25){
			
			System.out.println("Requerer aposentadoria");
		}
		
		else {
			System.out.println("Não requerer");
		}

		sc.close();
	}
}
