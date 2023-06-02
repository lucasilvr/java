/* Um programa para ler o código de uma peça 1, o número de peças 1, o valor 
unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o 
valor unitário de cada peça 2. Calcule e mostre o valor a ser pago */

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod_peca1, cod_peca2, qnt_peca1, qnt_peca2;
		double valor_peca1, valor_peca2, pagar;

		cod_peca1 = sc.nextInt();
		qnt_peca1 = sc.nextInt();
		valor_peca1 = sc.nextDouble();

		cod_peca2 = sc.nextInt();
		qnt_peca2 = sc.nextInt();
		valor_peca2 = sc.nextDouble();

		pagar = (valor_peca1 * qnt_peca1) + (valor_peca2 * qnt_peca2);

		System.out.printf("Total a pagar: R$ %.2f", pagar);

		sc.close();

	}

}
