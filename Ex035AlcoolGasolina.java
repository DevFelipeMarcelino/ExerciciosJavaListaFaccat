package listaFaccat;

import java.util.Scanner;

public class Ex035AlcoolGasolina {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a quantidade de litros vendidos: ");
				int QuantidadeLitros = sc.nextInt();
				
				System.out.println("Digite o tipo de combus�vel: (A-�cool / G-gasolina)");
				String tipo = sc.next();
				
				if(QuantidadeLitros < 21 && tipo == "A"){
					
					float ValorFinal = QuantidadeLitros -((QuantidadeLitros * 2.90f) * 0.03f);
					System.out.println("O valor que dever� ser pago: R$"+ValorFinal);
				}
				
				else{
					System.out.println("O valor que dever� ser pago: R$");
				}
				
				sc.close();
				
			}
}
