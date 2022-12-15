package listaFaccat;

import java.util.Scanner;

public class Ex023PesoIdeal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite o seu nome: ");
				String nome = sc.next();
				
				System.out.println("Digite a altura: ");
				float altura = sc.nextFloat();
				
				System.out.println("Digite o sexo (M/F): ");
				String sexo = sc.next();	
				
				float pesoH = ((72.7f * altura)-58);
				float pesoM = ((62.1f * altura)-44.7f);
				
				if(sexo == "M"){
					
					System.out.println("Pesso ideal: "+nome+" "+pesoH);
				}
				
				else {
					
					System.out.println("Pesso ideal: "+nome+" "+pesoM);
				}
				
				sc.close();
				
			}
}
