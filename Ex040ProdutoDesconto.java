package listaFaccat;

import java.util.Scanner;

public class Ex040ProdutoDesconto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a descri��o do produto: ");
				String nome = sc.next();
				
				System.out.println("Digite a quantidade adquirida: ");
				int quantidade = sc.nextInt();
				
				System.out.println("Digite o pre�o unit�rio: ");
				int preco = sc.nextInt();
				
				int total = quantidade * preco;
				
				if(quantidade <= 5){
					
					float TotalPagar = total - (total * 0.02f);
					System.out.println("Com um desconto de 2% ficar�: R$"+TotalPagar);
				}
					else if(quantidade > 5 && quantidade <= 10){
						
						float TotalPagar = total - (total * 0.03f);
						System.out.println("Com um desconto de 3% ficar�: R$"+TotalPagar);
					}
				
				
				else {
					
					float TotalPagar = total - (total * 0.05f);
					System.out.println("Com um desconto de 5% ficar�: R$"+TotalPagar);
				}
				
				sc.close();
				
			}
}
