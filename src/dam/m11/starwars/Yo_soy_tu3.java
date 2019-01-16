package dam.m11.starwars;

import java.util.Scanner;

public class Yo_soy_tu3 {
	
	static final String PERS_PARE_SECRETO = "Luke, yo soy tu padre";
	static final String MENSAJE_SECRETO = "TOP SECRET";
	static final String MENSAJE_NO_SECRETO = ", yo soy tu ";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int casos = sc.nextInt();
		sc.nextLine();
		
		String personaje;
		String parentesco;
		String[] cadenas = new String[casos];
		
		
		for (int i = 0; i < casos*2; i++) {
			personaje = sc.nextLine();
			parentesco = sc.nextLine();
			cadenas[i] = personaje + MENSAJE_NO_SECRETO + parentesco;
		}
		
		for (int i = 0; i < casos*2; i++) {
			if(cadenas[i].equals(PERS_PARE_SECRETO)) {
				System.out.println(MENSAJE_SECRETO);
		} else {
			System.out.println(cadenas[i]);
			
			}
		}
	
		sc.close();
	}

}