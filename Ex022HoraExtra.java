package listaFaccat;

import java.util.Scanner;

public class Ex022HoraExtra {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite o número de horas trabalhadas no mês: ");
				int HoraTrabalhada = sc.nextInt();
				
				System.out.println("Digite o salário recebido por hora: ");
				float SalarioHora = sc.nextFloat();
				
				if(HoraTrabalhada > 160){
					
					float HoraExtra = (SalarioHora * (HoraTrabalhada - 160));
					float SalarioFinal = (SalarioHora * 160) + (HoraExtra * 0.5f);
					
					System.out.println("O salário final será: R$"+SalarioFinal);
				}
				
				else {
					
					float SalarioFinal = (SalarioHora * 160);
					System.out.println("O salário final será: R$"+SalarioFinal);
				}
				
				sc.close();
				
			}
}
