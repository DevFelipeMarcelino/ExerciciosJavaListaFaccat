package listaFaccat;

import java.util.Scanner;

public class Ex017MediaAluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a primeira nota: ");
				float Nota1 = sc.nextInt();
				
				System.out.println("Digite a segunda nota: ");
				float Nota2 = sc.nextInt();
				
				float media = (Nota1 + Nota2) / 2;
				
				if(media<6){
					
					System.out.println("A média do aluno foi de: "+media+" e ele está reprovado");
				}
				
				else {
					
					System.out.println("A média do aluno foi de: "+media+" e ele está aprovado");
				}
				
				sc.close();
				
			}
}
