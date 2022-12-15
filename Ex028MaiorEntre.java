package listaFaccat;

import java.util.Scanner;

public class Ex028MaiorEntre {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int a = sc.nextInt();
		
		System.out.println("Digite o valor de B:");
		int b = sc.nextInt();
		
		System.out.println("Digite o valor de C:");
		int c = sc.nextInt();
		
		if(a > b && a > c){
			
			System.out.println("O maior entre eles é o valor A");
		}
		
		else if(b > a && b > c){
			System.out.println("O maior entre eles é o valor B");
		}
		
		else if(c > a && c > b){
			System.out.println("O maior entre eles é o valor C");
		}

		sc.close();
	}
}
