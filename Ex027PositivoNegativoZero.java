package listaFaccat;

import java.util.Scanner;

public class Ex027PositivoNegativoZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor = sc.nextInt();
		
		if(valor>0){
			
			System.out.println("O valor digitado � positivo");
		}
		
		else if(valor < 0){
			System.out.println("Ovalor digitado � negativo");
		}
		
		else {
			System.out.println("Ovalor digitado � igual a zero");
		}

		sc.close();
	}
}
