//menu com as opções para criar um personagem
package applicacao;

import java.util.Scanner;

public class TelaCriarPersonagem {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);	
	
	double criarPersonagem;
	
	System.out.println("CRIAR PERSONAGEM(Digite 3)");
	criarPersonagem = scanner.nextInt();
	
	if (criarPersonagem == 3) {
		System.out.println("ESCOLHA UM PERSONAGEM:");
	}
	}
}