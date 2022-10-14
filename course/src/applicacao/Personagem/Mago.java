package Personagem;

import Arma.Arma;
import Arma.Cajado;
import Arma.Varinha;

public class Mago extends Personagem {

	private static int ataque = 20;
	private static float defesa = 10;
	private static float pdv = 200;
	private static Arma arma1 = new Varinha();
	private static Arma arma2 = new Cajado();

	public Mago() {
		super(ataque,defesa,pontosDeVida,arma1,arma2);
	}

}