package applicacao;
//Ao iniciar uma nova partida, o jogo deve apresentar um menu com
//as opções para criar um personagem, começar a partida ou sair do jogo

import java.util.Scanner;

public class TelaEscolhaDePersonagem {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		
		double escolherPersonage;
		
		System.out.println("ESCOLHA UM PERSONAGEM:");
		System.out.println("DIGITE 1 PARA ESCOLHER O GUERREIRO");
		System.out.println("DIGITE 2 PARA ESCOLHER O MAGO");
		System.out.println("DIGITE 3 PARA ESCOLHER O ARQUEIRO");
		
		escolherPersonage = scanner.nextDouble(); 
		
		if (escolherPersonage == 1) {
			System.out.println("Você escolheu o personagem GUERREIRO");
		}
		else if(escolherPersonage == 2) {
			System.out.println("Você escolheu o personagem MAGO");
		}
		else if (escolherPersonage == 3) {
			System.out.println("Você escolheu o personagem ARQUEIRO");	
		}
		else {
			System.out.println("ATENÇÃO: VOCÊ DIGITOU O NÚMERO ERRADO! ESCOLHA O NÚMERO 1, 2 OU 3!");
		}
	}
}
				
			
			


