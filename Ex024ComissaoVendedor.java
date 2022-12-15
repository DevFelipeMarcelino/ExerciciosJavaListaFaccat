package listaFaccat;

import java.util.Scanner;

public class Ex024ComissaoVendedor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite o salário fixo: ");
				float SalarioFixo = sc.nextFloat();
				
				System.out.println("Digite o valor de vendas feitas: ");
				float ValorVendas = sc.nextFloat();
				
				if(ValorVendas < 1500){
					
					float SalarioFinal = (SalarioFixo + (ValorVendas * 0.30f));
					
					System.out.println("O salário final será: R$"+SalarioFinal);
				}
				
				else {
					
					float ValorVendasTotal = 1500 * 0.30f;
					float ValorExtra = ValorVendas - 1500;
					float SalarioFinal = SalarioFixo + ValorVendasTotal + (ValorExtra * 0.50f) ;
					
					System.out.println("O salário final será: R$"+SalarioFinal);
				}
				
				sc.close();
				
			}
}
