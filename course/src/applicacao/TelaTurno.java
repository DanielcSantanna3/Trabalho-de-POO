//fazer um laço de turnos
package applicacao;

import java.util.Scanner;

public class TelaTurno {
	
		public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);	
		
		double turno;
		
		System.out.println("Turno X");
		System.out.println("Digite 1 para atacar!");
		System.out.println("Digite 2 para defender!");
		turno = scanner.nextDouble();
		
		if (turno == 1) {
			System.out.println("Você escolheu ATACAR!");
		}
		else {
			System.out.print("Você escolheu DEFENDER!");
		}
		}	
}


