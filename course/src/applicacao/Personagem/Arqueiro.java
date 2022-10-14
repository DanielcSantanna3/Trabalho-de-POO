package Personagem;

import Arma.ArcoLongo;
import Arma.Arma;
import Arma.Balestra;

public class Arqueiro extends Personagem {

	private static int ataque = 100;
	private static int defesa = 30;
	private static float pdv = 160;
	private static Arma arma1 = new ArcoLongo();
	private static Arma arma2 = new Balestra();

	public Arqueiro() {
		super(ataque,defesa,pontosDeVida,arma1,arma2);
	}

}