package applicacao;

import java.util.Scanner;

public class TelaArmaMago {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);	
	
	double armaMago;
	
	System.out.println("ESCOLHA A ARMA QUE DESEJE PARA O MAGO:");
	System.out.println("VARINHA - ATQ:+16 / DEF:+9 (Digite 1)");
	System.out.println("CAJADO - ATQ:+13 / DEF:+12  (Digite 2)");
	armaMago = scanner.nextInt();
	
	if (armaMago == 1) {
		System.out.println("Você escolheu a arma VARINHA!");
	}
	else {
		System.out.print("Você escolheu a arma CAJADO!");
	}
	}	
}