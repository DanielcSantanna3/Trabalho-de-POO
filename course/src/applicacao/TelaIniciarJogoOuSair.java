package applicacao;

import java.util.Scanner;

public class TelaIniciarJogoOuSair {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);	
	
	double iniciarJogo;
	
	System.out.println("COMEÇAR O JOGO(Digite 1)");
	System.out.println("SAIR DO JOGO(Digite 2)");
	iniciarJogo = scanner.nextInt();
	
	if (iniciarJogo == 1) {
		System.out.println("Você iniciou o Jogo Heros of POO!");
	}
	else {
		System.out.print("Você saiu do Jogo Heros of POO!");
	}
	}	
}