package listaFaccat;

import java.util.Scanner;

public class Ex041MediaAproveitamento {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a primeira nota: ");
				float Nota1 = sc.nextInt();
				
				System.out.println("Digite a segunda nota: ");
				float Nota2 = sc.nextInt();
				
				System.out.println("Digite a terceira nota: ");
				float Nota3 = sc.nextInt();
				
				System.out.println("Digite a M�dia dos Exerc�cios: ");
				float MediaExercicios = sc.nextInt();
				
				float MediaAproveitamento =  (Nota1 + Nota2 * 2 + Nota3 * 3 + MediaExercicios) / 7;
				
				if(MediaAproveitamento >= 9) {
					System.out.println("A m�dia de aproveitamento �: "+MediaAproveitamento+" e o conceito � A");
				}
				
				else if(MediaAproveitamento >= 7.5 && MediaAproveitamento < 9) {
					System.out.println("A m�dia de aproveitamento �: "+MediaAproveitamento+" e o conceito � B");
				}
				
				else if(MediaAproveitamento >= 6 && MediaAproveitamento < 7.5) {
					System.out.println("A m�dia de aproveitamento �: "+MediaAproveitamento+" e o conceito � C");
				}
				
				else{
					System.out.println("A m�dia de aproveitamento �: "+MediaAproveitamento+" e o conceito � D");
				}
				
				sc.close();
				
			}
}
