package ClassePersonagem;

import Arma.Arma;
import Arma.Espada;
import Arma.Machado;

public class Guerreiro extends Personagem {

	private static int ataque = 30;
	private static float defesa = 20;
	private static float pdv = 180;
	private static Arma arma1 = new Espada();
	private static Arma arma2 = new Machado();

	public Guerreiro() {
		super(ataque,defesa,pdv,arma1,arma2);
	}

}
