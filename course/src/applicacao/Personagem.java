package applicacao;

public class Personagem {
	private double ataque;
	private double defesa;
	private double pdv;
		
	public Personagem() {
		ataque = 0;
		defesa = 0;
		pdv = 0;
	}
	
	public void ataqueDoPersonagem(double ataque) {
		this.ataque = ataque;
	}
	public void defesaDoPersonagem(double defesa) {
		this.defesa = defesa;
	}
	public void pontosDeVida(double pdv) {
		this.pdv = pdv;
	}
	public double getAtaqueDoPersonagem() {
		return this.ataque;
	}
	public double getDefesaDoPersonagem() {
		return this.defesa;
	}
	public double getPdf() {
		return this.pdv;
	}
	}