package dam.m11.edicion2017;

import java.util.Scanner;

/**
 * Conseguir un cuadrado perfecto
 * Un número es un cuadrado perfecto si su raíz cuadrada es un número exacto 
 * (sin decimales). Por ejemplo, el 4 es un cuadrado perfecto (22), al igual que lo 
 * son el 36 (62) y el 3.500.641 (18712). Todos los números que no son cuadrados perfectos pueden multiplicarse por otros para conseguir serlo. Por 
 * ejemplo, el número 8 no es un cuadrado perfecto, pero al multiplicarlo por 2 se obtiene el 16, que sí lo es.
 * 
 * Entrada La entrada comienza con un número que indica cuántos casos de 
 * prueba tendrán que procesarse. Cada caso de prueba consiste en un número 
 * mayor que 0 y menor que 231.
 * 
 * Salida Para cada caso de prueba, el programa escribirá por la salida estándar, 
 * en una línea independiente, el número más pequeño que al ser multiplicado por 
 * el número del caso de prueba da como resultado un cuadrado perfecto.
 * 
 * @author 21812026
 *
 */

public class CuadradosPerfectos {

	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		// esta línea en programame no la incluiriamos
		
		int cantidad = solicitarValorEntero("Indica la cantidad de números a introducir");
		
		int num;
		boolean esCP;
		for (int i = 1; i <= cantidad; i++) {
			// esta línea en programame no la incluiriamos
			num = solicitarValorEntero("Introduzca el número entero " + i);
			
			// analizar si num es cuadrado perfecto
			esCP = comprobarCuadradoPerfecto(num);
		}
		
		
		
		sc.close();

	}

	private static boolean comprobarCuadradoPerfecto(int num) {
		// calculamos la parte entera de la raíz cuadrada de num
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
