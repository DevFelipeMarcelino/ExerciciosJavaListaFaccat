package listaFaccat;

import java.util.Scanner;

public class Ex015PositivoNegativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor = sc.nextInt();
		
		if(valor>-1){
			
			System.out.println("O valor digitado é positivo");
		}
		else {
			System.out.println("Ovalor digitado é negativo");
		}

		sc.close();
	}

}
