//Um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("par");
		} else {
			System.out.println("ímpar");

		}
		sc.close();
	}

}
