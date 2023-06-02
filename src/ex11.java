/* Com base na tabela abaixo, escreva um programa que leia o código de um i
tem e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
1) Cachorro R$ 4.00
2) X-Salada R$ 4.50
3) X-Bacon R$ 5.00
4) Torrada Simples R$ 2.00
5) Refrigerante R$ 1.50 */

import java.util.Locale;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double valor = 0;
		
		switch(codigo) {
		case 1:
			valor = 4.00*quantidade;
			System.out.printf("Cachorro quente: pagar R$ %.2f", valor);
			break;
		case 2:
			valor = 4.50*quantidade;
			System.out.printf("X-Salada: pagar R$ %.2f", valor);
			break;
		case 3:
			valor = 5.00*quantidade;
			System.out.printf("X-Bacon: pagar R$ %.2f", valor);
			break;
		case 4:
			valor = 2.00*quantidade;
			System.out.printf("Torrada Simples: pagar R$ %.2f", valor);
			break;
		case 5:
			valor = 1.50*quantidade;
			System.out.printf("Refrigerante: pagar R$ %.2f", valor);
			break;
		default:
			System.out.println("CÓDIGOS: APENAS 1, 2, 3, 4 e 5");
		
		}
		sc.close();

	}

}



