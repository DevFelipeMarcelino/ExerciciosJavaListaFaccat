package listaFaccat;

import java.util.Scanner;

public class Ex030OrdemCrescente {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int a = sc.nextInt();
		
		System.out.println("Digite o valor de B:");
		int b = sc.nextInt();
		
		System.out.println("Digite o valor de C:");
		int c = sc.nextInt();
		
		if(a > b && b > c){
			
			
			System.out.println("Deixar em ordem crescente: "+c+", "+b+" e "+a);
		}
		
		else if(a > c && c > b){
			
			System.out.println("Deixar em ordem crescente: "+b+", "+c+" e "+a);
		}
		
            else if(c > b && b > a){
			
            System.out.println("Deixar em ordem crescente: "+a+", "+b+" e "+c);
		}
		
            else if(c > a && a > b){
    			
                System.out.println("Deixar em ordem crescente: "+b+", "+a+" e "+c);
    		}
		
            else if(b > a && a > c){
    			
                System.out.println("Deixar em ordem crescente: "+c+", "+a+" e "+b);
    		}
		
                else if(b > c && c > a){
    			
                System.out.println("Deixar em ordem crescente: "+a+", "+c+" e "+b);
    		}

		sc.close();
	}
}
