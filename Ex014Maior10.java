package listaFaccat;

import java.util.Scanner;

public class Ex014Maior10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite um valor:");
				float valor = sc.nextFloat();
				
				if(valor>10){
					
					System.out.println("O valor digitado é maior que 10");
				}
				
				else {
					
					System.out.println("O valor digitado não é maior que 10");
				}
				
				
				sc.close();
				
			}

}
