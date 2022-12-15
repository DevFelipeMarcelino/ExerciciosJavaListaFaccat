package listaFaccat;

import java.util.Scanner;

public class Ex016PrecoMaca {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a quantidade de maçãs compradas: ");
				int quantidade = sc.nextInt();
				
				if(quantidade<12){
					
					float valor = quantidade * 1.30f;
					
					System.out.println("O valor a ser pago deverá ser de: R$"+valor);
				}
				
				else {
 					
                    int valor = quantidade * 1;
					
					System.out.println("O valor a ser pago deverá ser de: R$"+valor);
				}
				
				sc.close();
				
			}

}
