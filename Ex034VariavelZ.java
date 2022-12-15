package listaFaccat;

import java.util.Scanner;

public class Ex034VariavelZ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite o valor de X: ");
				float x = sc.nextInt();
				
				System.out.println("Digite o valor de y: ");
				float y = sc.nextInt();
				
				float z = (x*y) + 5;
				
				if(z <= 0){
					
					String resposta = "A";
					System.out.println("Resolução: "+z+" e "+resposta);
				}
				
				else if(z <= 100){
					
					String resposta = "B";
					System.out.println("Resolução: "+z+" e "+resposta);
				}
				
				else {
					
					String resposta = "C";
					System.out.println("Resolução: "+z+" e "+resposta);
				}
				
				
				
				sc.close();
				
			}
}
