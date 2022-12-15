package listaFaccat;

import java.util.Scanner;

public class Ex026QuantidadeEstoque {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a quantidade atual em estoque: ");
				float QuantidadeAtual = sc.nextFloat();
				
				System.out.println("Digite a quantidade máxima do estoque: ");
				float QuantidadeMaxima = sc.nextFloat();
				
				System.out.println("Digite a quantidade mínima do estoque: ");
				float QuantidadeMinima = sc.nextFloat();
				
				float QuantidadeMedia = (QuantidadeMaxima + QuantidadeMinima) /2;
				
				if(QuantidadeAtual >= QuantidadeMedia){
					
					System.out.println("Não  efetuar  compra");
				}
				
				else {
					
					System.out.println("Efetuar compra");
				}
				
				sc.close();
				
			}
}
