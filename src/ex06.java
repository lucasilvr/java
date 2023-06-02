//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

import java.util.Locale;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, tri_ret, pi, area_circ, area_trape, area_quad, area_ret;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi = 3.14159;

		tri_ret = (A * C) / 2;
		area_circ = pi * (C * C);
		area_trape = ((A + B) * C) / 2;
		area_quad = B * B;
		area_ret = A * B;

		System.out.printf("a área do triângulo retângulo: %.3f%n", tri_ret);
		System.out.printf("a área do círculo: %.3f%n", area_circ);
		System.out.printf("a área do trapézio: %.3f%n", area_trape);
		System.out.printf(" a área do quadrado: %.3f%n", area_quad);
		System.out.printf("a área do retângulo: %.3f%n", area_ret);

		sc.close();
	}

}
