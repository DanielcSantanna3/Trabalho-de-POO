package applicacao;

import java.util.Scanner;

public class Tela {
	
	Scanner scanner = new Scanner(System.in);
	
	public void telaBoasVindas(){
	iniciarJogo
	System.out.println("SEJA BEM VINDO AO HEROS OF POO! SELECIONE UMA DAS OPÇÕES ABAIXO!");
	System.out.println("COMEÇAR O JOGO(Digite 1)");
	System.out.println("SAIR DO JOGO(Digite 2)");
	iniciarJogo = scanner.nextInt();
	if (sc == '2') {
		exit()
	}
	}
	
}

private int iniciarJogo(int i, int min, int max) {
	Scanner scanner = new Scanner(System.in);
	int dezena;
	boolean valido;
	
	do {
	    System.out.printf("Informe a %da. dezena: ", i+1);
	    dezena = scanner.nextInt();
	    
	    valido = dezena >= min && dezena <= max;
	    if (!valido) {
		System.out.printf("Dezena inválida! Dezena deve estar entre %d e %d.%n%n", min, max);
	    } else {
		for (int d : aposta) {
		    if (d == dezena) {
			System.out.println("Dezena repetida!\n");
			valido = false;
			break;
		    }
		}
	    }
	} while(!valido);

	return dezena;
    } // fim do método informarDezena