package listaFaccat;

import java.util.Scanner;

public class Ex037MacaMorango {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a quantidade de maçãs compradas: ");
				int macas = sc.nextInt();
				
				System.out.println("Digite a quantidade de morangos compradas: ");
				int morango = sc.nextInt();
				
				float ValorMorango;
				float ValorMaca;
				
				if(morango < 6){
					
					 ValorMorango = morango * 2.5f;
				}
				
				else{
					
					 ValorMorango = morango * 2.3f;
				}
				
                  if(macas < 6){
					
					 ValorMaca = macas * 1.8f;
				}
				
				else{
					
					 ValorMaca = macas * 1.5f;
				}
                  	
                  float ValorFinal = ValorMorango + ValorMaca;
                  
                  System.out.println(ValorFinal);
                  
                  
				
				sc.close();
				
			}
}
