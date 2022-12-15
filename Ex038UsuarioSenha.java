package listaFaccat;

import java.util.Scanner;

public class Ex038UsuarioSenha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite o código do usuário: ");
				int usuario = sc.nextInt();
				
				if(usuario == 1234){
					
					System.out.println("Digite a senha");
					int senha = sc.nextInt();
					
					if(senha == 9999) {
						System.out.println("Acesso permitido");
					}
					else {
						System.out.println("Senha incorreta");
					}
				}
				
				else {
					
					System.out.println("Código de usuário incorreto");
				}
				
				sc.close();
				
			}
}
