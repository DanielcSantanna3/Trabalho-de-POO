package applicacao;

import java.util.Scanner;

public class Telas {

	private static final int TelaCriarPersonagem = 0;
	Scanner scanner = new Scanner(System.in);

	public void TelaInicial() {

		double TelaInicial;

		System.out.println("COMEÇAR O JOGO(Digite 1)");
		System.out.println("SAIR DO JOGO(Digite 2)");

		TelaInicial = scanner.nextDouble();

		if (TelaInicial == 1) {
			System.out.println("Você iniciou o Jogo Heros of POO!");
		} 
		else if (TelaInicial == 2) {
			System.out.println("Você saiu do Jogo Heros of POO!");
			System.exit(1);
		} 
		else {
			System.out.println("ATENÇÃO: VOCÊ DIGITOU O NÚMERO ERRADO! ESCOLHA O NÚMERO 1, 2");
		}
	}

	public void TelaCriarPersonagem() {
		System.out.println("COMEÇAR O JOGO(Digite 1)");
		System.out.println("SAIR DO JOGO(Digite 2)");
		System.out.println("CRIAR PERSONAGEM (Digite 3)");
	
		double TelaCriarPersonagem = scanner.nextDouble();

		if(TelaCriarPersonagem==1){
			System.out.println("Você iniciou o Jogo Heros of POO!");
		}
		else if(TelaCriarPersonagem==2) {
			System.out.println("Você saiu do Jogo Heros of POO!");
			System.exit(1);
		}
		else {
		System.out.println("Vamos criar um Personagem!");
		}
	} 
	
	public void TelaEscolherPersonage() {
	
		System.out.println("ESCOLHA UM PERSONAGEM:");
		System.out.println("DIGITE 1 PARA ESCOLHER O GUERREIRO");
		System.out.println("DIGITE 2 PARA ESCOLHER O MAGO");
		System.out.println("DIGITE 3 PARA ESCOLHER O ARQUEIRO");
	
		double TelaEscolherPersonage = scanner.nextDouble(); 
	
		if (TelaEscolherPersonage == 1) {
			System.out.println("Você escolheu o personagem GUERREIRO");
		}
		else if(TelaEscolherPersonage == 2) {
			System.out.println("Você escolheu o personagem MAGO");
		}
		else if (TelaEscolherPersonage == 3) {
			System.out.println("Você escolheu o personagem ARQUEIRO");	
		}
		else {
			System.out.println("ATENÇÃO: VOCÊ DIGITOU O NÚMERO ERRADO! ESCOLHA O NÚMERO 1, 2 OU 3!");
		}
}
	public void TelaArmaArqueiro() {
		
		System.out.println("ESCOLHA A ARMA QUE DESEJE PARA O ARQUEIRO:");
		System.out.println("ARCO LONGO - ATQ:+12 / DEF:+13 (Digite 1)");
		System.out.println("BALESTRA - ATQ:+15 / DEF:+10  (Digite 2)");
		
		double TelaArmaArqueiro = scanner.nextInt();
		
		if (TelaArmaArqueiro == 1) {
			System.out.println("Você escolheu a arma ARCO LONGO!");
		}
		else {
			System.out.print("Você escolheu a arma BALESTRA!");
	}
}
	
	public void TelaArmaMago() {
		
		System.out.println("ESCOLHA A ARMA QUE DESEJE PARA O MAGO:");
		System.out.println("VARINHA - ATQ:+16 / DEF:+9 (Digite 1)");
		System.out.println("CAJADO - ATQ:+13 / DEF:+12  (Digite 2)");
		
		double TelaArmaMago = scanner.nextInt();
		
		if (TelaArmaMago == 1) {
			System.out.println("Você escolheu a arma VARINHA!");
		}
		else {
			System.out.print("Você escolheu a arma CAJADO!");
	}
}
}

	
