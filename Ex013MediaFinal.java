package listaFaccat;

import java.util.Scanner;

public class Ex013MediaFinal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a primeira nota: ");
				float Nota1 = sc.nextInt();
				
				System.out.println("Digite a segunda nota: ");
				float Nota2 = sc.nextInt();
				
				System.out.println("Digite a terceira nota: ");
				float Nota3 = sc.nextInt();
				
				float media = (Nota1 * 2 + Nota2 * 3 + Nota3 * 5) / 10;
				
				System.out.println("A média final ficou: "+media);
				
				sc.close();
				
			}
}
