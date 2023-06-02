//Programa para ler um número inteiro, e depois dizer se este número é negativo ou não

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("numero negativo");
		}

		else {
			System.out.println("numero não negativo");
		}

		sc.close();
	}

}
