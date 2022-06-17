package triangulo;

import java.util.Scanner;

import geometria.Triangulo;

/**
 * @author jean.benetti
 *
 */
public class TrianguloExec {

	public static void main(String[] args) {

		Triangulo a = new Triangulo();
		Triangulo b = new Triangulo();
		
		// Triangulo A
		entrada(a);		
		if (a.validar()) {
			System.out.println(a.toString());
		} else {
			System.out.println("\n\nOs lados informados não são de um triangulo\n");
		}
		
		// Triangulo B
		entrada(b);
		if (b.validar()) {
			System.out.println(b);
		} else {
			System.out.println("\n\nOs lados informados não são de um triangulo\n");
		}
		System.out.println("teste");
	}
	
	public static void entrada (Triangulo lado) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores dos lados:");
		lado.x = sc.nextDouble();
		lado.y = sc.nextDouble();
		lado.z = sc.nextDouble();	
		
		
	}

}
