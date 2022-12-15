package listaFaccat;

import java.util.Scanner;

public class Ex031FormandoTriangulo {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int a = sc.nextInt();
		
		System.out.println("Digite o valor de B:");
		int b = sc.nextInt();
		
		System.out.println("Digite o valor de C:");
		int c = sc.nextInt();
		
		if(c < (a+b) && a < (b+c) && b < (a+c)){
			
			System.out.println("Forma um triângulo");
		}
		
		else {
			
			System.out.println("Não forma um triângulo");
		}

		sc.close();
	}
}
