package dam.m11.edicion2017;

import java.util.Scanner;

/**
 * Conseguir un cuadrado perfecto
 * Un n�mero es un cuadrado perfecto si su ra�z cuadrada es un n�mero exacto 
 * (sin decimales). Por ejemplo, el 4 es un cuadrado perfecto (22), al igual que lo 
 * son el 36 (62) y el 3.500.641 (18712). Todos los n�meros que no son cuadrados perfectos pueden multiplicarse por otros para conseguir serlo. Por 
 * ejemplo, el n�mero 8 no es un cuadrado perfecto, pero al multiplicarlo por 2 se obtiene el 16, que s� lo es.
 * 
 * Entrada La entrada comienza con un n�mero que indica cu�ntos casos de 
 * prueba tendr�n que procesarse. Cada caso de prueba consiste en un n�mero 
 * mayor que 0 y menor que 231.
 * 
 * Salida Para cada caso de prueba, el programa escribir� por la salida est�ndar, 
 * en una l�nea independiente, el n�mero m�s peque�o que al ser multiplicado por 
 * el n�mero del caso de prueba da como resultado un cuadrado perfecto.
 * 
 * @author 21812026
 *
 */

public class CuadradosPerfectos {

	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		// esta l�nea en programame no la incluiriamos
		
		int cantidad = solicitarValorEntero("Indica la cantidad de n�meros a introducir");
		
		int num;
		boolean esCP;
		for (int i = 1; i <= cantidad; i++) {
			// esta l�nea en programame no la incluiriamos
			num = solicitarValorEntero("Introduzca el n�mero entero " + i);
			
			// analizar si num es cuadrado perfecto
			esCP = comprobarCuadradoPerfecto(num);
		}
		
		
		
		sc.close();

	}

	private static boolean comprobarCuadradoPerfecto(int num) {
		// calculamos la parte entera de la ra�z cuadrada de num
		int rc = (int) Math.floor(Math.sqrt(num));
		
		if (num == rc * rc) {
			return true;
		} else {
			return false;
		}
		
	}

	private static int solicitarValorEntero(String mensaje){
		System.out.println(mensaje);
		int entero = Integer.parseInt(sc.nextLine());
		return entero;
	}
}
