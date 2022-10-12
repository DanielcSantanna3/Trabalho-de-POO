package applicacao;

import java.util.Scanner;

public class TelaArmaArqueiro {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);	
	
	double armaArqueiro;
	
	System.out.println("ESCOLHA A ARMA QUE DESEJE PARA O ARQUEIRO:");
	System.out.println("ARCO LONGO - ATQ:+12 / DEF:+13 (Digite 1)");
	System.out.println("BALESTRA - ATQ:+15 / DEF:+10  (Digite 2)");
	armaArqueiro = scanner.nextInt();
	
	if (armaArqueiro == 1) {
		System.out.println("Você escolheu a arma ARCO LONGO!");
	}
	else {
		System.out.print("Você escolheu a arma BALESTRA!");
	}
	}	
}