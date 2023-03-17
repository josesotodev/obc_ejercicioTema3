package obc_ejrecicioTema3;

public class Coche {

	public Coche(int puerta) {
		super();
		this.puerta = puerta;
	}

	int puerta;
	
	public int incrementoPuerta() {
		puerta++;
		return puerta;	
	}
	
}
