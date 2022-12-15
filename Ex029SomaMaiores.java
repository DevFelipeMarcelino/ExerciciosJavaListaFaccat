package listaFaccat;

import java.util.Scanner;

public class Ex029SomaMaiores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int a = sc.nextInt();
		
		System.out.println("Digite o valor de B:");
		int b = sc.nextInt();
		
		System.out.println("Digite o valor de C:");
		int c = sc.nextInt();
		
		if(a > b && b > c){
			
			int soma = a + b;
			
			System.out.println("A soma dos dois maiores valores é: "+soma);
		}
		
		else if(a > c && c > b){
			
            int soma = a + c;
			
			System.out.println("A soma dos dois maiores valores é: "+soma);
		}
		
            else if(c > b && b > a){
			
            int soma = b + c;
			
			System.out.println("A soma dos dois maiores valores é: "+soma);
		}
		
            else if(b > c && c > a){
    			
                int soma = b + c;
    			
    			System.out.println("A soma dos dois maiores valores é: "+soma);
    		}

		sc.close();
	}
}
