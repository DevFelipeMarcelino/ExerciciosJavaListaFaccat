package listaFaccat;

import java.util.Scanner;

public class Ex036HomemMulher {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idade do primeiro homem:");
		int homem1 = sc.nextInt();
		
		System.out.println("Digite a idade do segundo homem:");
		int homem2 = sc.nextInt();
		
		System.out.println("Digite a idade da primeira mulher:");
		int mulher1 = sc.nextInt();
		
		System.out.println("Digite a idade da segunda mulher:");
		int mulher2 = sc.nextInt();
		
		
		if(homem1 > homem2 && mulher1 < mulher2){
			
			int soma = homem1 + mulher1;
			System.out.println("A soma das  idades  do  homem  mais  velho  com  a  mulher  mais  nova é: "+soma);
		}
		
		else if(homem1 > homem2 && mulher1 > mulher2){
			
			int soma = homem1 + mulher2;
			System.out.println("A soma das  idades  do  homem  mais  velho  com  a  mulher  mais  nova é: "+soma);
		}
		
		else if(homem1 < homem2 && mulher1 < mulher2){
			
			int soma = homem2 + mulher1;
			System.out.println("A soma das  idades  do  homem  mais  velho  com  a  mulher  mais  nova é: "+soma);
		}
		
		else if(homem1 < homem2 && mulher1 > mulher2){
			
			int soma = homem2 + mulher2;
			System.out.println("A soma das  idades  do  homem  mais  velho  com  a  mulher  mais  nova é: "+soma);
		}
		

		sc.close();
	}
}
