package applicacao;

public class Mago {
	
	public String nome;
	public double ataque;
	public double defesa;
	public double pdv;

	public Mago (double ataque, double defesa, double pdv) {
		System.out.println("Estes são as caracteristicas iniciais do MAGO:");
		this.ataque = ataque;
		this.defesa = defesa;
		this.pdv = pdv;
		System.out.println("Seu ataque é " + ataque);
	}
}
/*	}
	
	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public double getDefesa() {
		return defesa;
	}

	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}

	public double getPdv() {
		return pdv;*/
//	}

//	public void setPdv(double pdv) {
//		this.pdv = pdv;
//	}
//}
// public double atacar() {
// double atacar = this.ataque;
// return atacar;
// }

// public double defender() {
/// double defender = this.defesa;
// return defender;
// }
// public double pdv() {
// double atacar = this.pdv;
// return atacar;
// }
//}
