package listaFaccat;

import java.util.Scanner;

public class Ex020OrdemCrescente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite um valor: ");
				float valor1 = sc.nextInt();
				
				System.out.println("Digite outro valor: ");
				float valor2 = sc.nextInt();
				
				if(valor1 < valor2){
					
					System.out.println("Em ordem crescente: "+valor1+" e "+valor2);
				}
				
				else if(valor2 > valor1){
					
					System.out.println("Em ordem crescente: "+valor2+" e "+valor1);
				}
				
				else {
					
					System.out.println("Os valores digitados s?o iguais");
				}
				
				sc.close();
				
			}
}
