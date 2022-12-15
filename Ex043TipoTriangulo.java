package listaFaccat;

import java.util.Scanner;

public class Ex043TipoTriangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	System.out.println("Digite o valor de A: ");
	int a = sc.nextInt();
	
	System.out.println("Digite o valor de B: ");
	int b = sc.nextInt();
	
	System.out.println("Digite o valor de C: ");
	int c = sc.nextInt();
	
    if (a < b + c && b < a + c && c < a + b) {
    	
        if(a==b && b==c){
        	String mens = "Triângulo Equilátero";
        	System.out.println(mens);
        

    } else if (a==b || b==c || a==c) {
        String mens = "Triângulo Isósceles";
        System.out.println(mens);

    } else {
    	String mens = "Triângulo Escaleno";
    	System.out.println(mens);
    }}

    else {
    	String mens = "Não e possível formar um triângulo";
    	System.out.println(mens);
    }
    
    


}


}
