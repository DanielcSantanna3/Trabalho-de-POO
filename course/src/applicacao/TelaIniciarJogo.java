//O jogo inicia apresentando um menu para o usuário, oferecendo iniciar uma nova
//partida ou sair do jogo.
package applicacao;

import java.util.Scanner;

public class TelaIniciarJogo {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);	
	
	double iniciarJogo;
	
	System.out.println("COMEÇAR O JOGO(Digite 1)");
	iniciarJogo = scanner.nextInt();
	
	if (iniciarJogo == 1) {
		System.out.println("Você iniciou o Jogo Heros of POO!");
	}
	}	
}