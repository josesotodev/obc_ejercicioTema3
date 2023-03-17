package obc_ejrecicioTema3;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(funcion(1,2,3));
		System.out.println(funcion(10, 15, 20));
		
		Coche cocheUno = new Coche();
		
		
	}
	
	public static int funcion(int a, int b, int c) {
		int resultado = a + b + c;
		return resultado;
	}

	
	
}

class Coche{
	
	int puerta;
	
	public int incrementoPuerta() {
		puerta++;
		return puerta;	
	}
}