package listaFaccat;

import java.util.Scanner;

public class Ex040ProdutoDesconto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a descrição do produto: ");
				String nome = sc.next();
				
				System.out.println("Digite a quantidade adquirida: ");
				int quantidade = sc.nextInt();
				
				System.out.println("Digite o preço unitário: ");
				int preco = sc.nextInt();
				
				int total = quantidade * preco;
				
				if(quantidade <= 5){
					
					float TotalPagar = total - (total * 0.02f);
					System.out.println("Com um desconto de 2% ficará: R$"+TotalPagar);
				}
					else if(quantidade > 5 && quantidade <= 10){
						
						float TotalPagar = total - (total * 0.03f);
						System.out.println("Com um desconto de 3% ficará: R$"+TotalPagar);
					}
				
				
				else {
					
					float TotalPagar = total - (total * 0.05f);
					System.out.println("Com um desconto de 5% ficará: R$"+TotalPagar);
				}
				
				sc.close();
				
			}
}
