package obc_ejrecicioTema3;

public class Primera_parte {

	public void imprimeFuncion() {
		System.out.println("Primera parte");
		System.out.println("Crear una función con tres parámetros que sean números que se suman entre sí.\r\n"
				+ "Llamar a la función en el main y darle valores.");
		System.out.println("Despues de pasar los valores 1, 2, 3 y 10, 15, 20 a la función de sumar, el resultado es:");
		
		System.out.println(funcion(1,2,3));
		System.out.println(funcion(10, 15, 20));
	}

		public static int funcion(int a, int b, int c) {
			int resultado = a + b + c;
			return resultado;
		}
	
}
