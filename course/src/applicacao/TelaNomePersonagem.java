//definindo o nome do personagem; //vamos precisar de 3 telas dessas!!!!!!!!!!! 
//o jogador pode escolher até 3 personagens
package applicacao;

import java.util.Scanner;

public class TelaNomePersonagem {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);	
	
	String escolherNome;
	
	System.out.println("Digite o nome para o personagem:");
	escolherNome = scanner.nextLine();
	System.out.println("O nome do personagem é: " + escolherNome);
	
}
}