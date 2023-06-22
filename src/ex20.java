/*Programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit. Perguntar se o
 * usuário deseja repetir (s/n) a operação */

import java.util.Locale;
import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		char resp; //tem que declarar essa variável fora pois quando fechou a chaves
		//o while não reconheceu
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			double fahrenheit = (9.0*celsius)/5.0 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n" , fahrenheit);
			System.out.print("Deseja continuar? (s/n): ");
			resp  = sc.next().charAt(0);
					
		} while (resp != 'n'); {
			sc.close();
		}
	}

}
