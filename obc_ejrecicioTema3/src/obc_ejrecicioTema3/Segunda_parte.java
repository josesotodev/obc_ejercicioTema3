package obc_ejrecicioTema3;

public class Segunda_parte {

	//Segunda parte
	
	/*
	Crear una clase coche.

	Dentro de la clase coche, una variable num�rica que almacene el n�mero de puertas que tiene.

	Una funci�n que incremente el n�mero de puertas que tiene el coche.

	Crear un objeto miCoche en el main y a�adirle una puerta.

	Mostrar el n�mero de puertas que tiene el objeto.
	 */
	
	public void imprimeSegundaParte() {
		Coche cocheUno = new Coche(4);
		int numeroPuertasCoche = cocheUno.puerta;
		int numeroPuertasFinal = cocheUno.incrementoPuerta();
		
		System.out.println("Segunda Parte");
		System.out.println("un coche con " + numeroPuertasCoche + " puertas, despues del incremento tiene " + numeroPuertasFinal + " puertas");
		
	}
		
}
