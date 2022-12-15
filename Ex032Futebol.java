package listaFaccat;
import java.util.Scanner;

public class Ex032Futebol {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do primeiro time:");
		String a = sc.next();
		
		System.out.println("E quantos gols ele fez:");
		int golsA = sc.nextInt();
		
		System.out.println("Digite o nome do segundo time:");
		String b = sc.next();
		
		System.out.println("E quantos gols ele fez:");
		int golsB = sc.nextInt();
		
		
		if(golsA > golsB){
			
			System.out.println("Time vencedor foi o: "+a);
		}
		
		else if(golsA < golsB){
			
			System.out.println("Time vencedor foi o: "+b);
		}
		
		else {
			System.out.println("Deu empate!");
		}

		sc.close();
	}
}
