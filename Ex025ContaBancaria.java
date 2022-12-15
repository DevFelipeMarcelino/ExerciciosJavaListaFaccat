package listaFaccat;

import java.util.Scanner;


public class Ex025ContaBancaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite o saldo: ");
				float saldo = sc.nextFloat();
				
				System.out.println("Digite o débito: ");
				float debito = sc.nextFloat();
				
				System.out.println("Digite o credito: ");
				float credito = sc.nextFloat();
				
				float SaldoAtual = saldo - debito + credito;
				
				if(SaldoAtual>0){
					
					System.out.println("Seu saldo está positivo e atualmente é de: R$"+SaldoAtual);
				}
				
				else {
					
					System.out.println("Seu saldo está negativo e atualmente é de: R$"+SaldoAtual);
				}
				
				sc.close();
				
			}
}
