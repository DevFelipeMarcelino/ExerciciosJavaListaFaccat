package listaFaccat;

import java.util.Scanner;

public class Ex033PrimeiroMaior {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite um valor: ");
				float valor1 = sc.nextInt();
				
				System.out.println("Digite outro valor: ");
				float valor2 = sc.nextInt();
				
				if(valor1 == valor2){
					
					System.out.println("N?meros iguais");
				}
				
				else if(valor2>valor1){
					
					System.out.println("Segundo maior");
				}
				
				else {
					
					System.out.println("Primeiro ? maior");
				}
				
				sc.close();
				
			}
}
