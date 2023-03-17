package obc_ejrecicioTema3;

public class Main {

	public static void main(String[] args) {
		
		//Primera parte
		System.out.println(funcion(1,2,3));
		System.out.println(funcion(10, 15, 20));
		
		
		//Segunda parte
		Coche cocheUno = new Coche(4);
		int numeroPuertas = cocheUno.incrementoPuerta();
		
		System.out.println(numeroPuertas);
		
	}
	
	//Primera parte
	public static int funcion(int a, int b, int c) {
		int resultado = a + b + c;
		return resultado;
	}

	
	
}

//Segunda parte
class Coche{
	
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