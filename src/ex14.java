//Um programa que lê números inteiros até que um zero seja lido. Ao final mostra a soma dos números lidos.

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		int total = 0;
		
		while (num != 0) {
			total = total + num;
			num = sc.nextInt();
		}
		
		System.out.println("soma de todos os números inseridos: " + total);

		sc.close();
	}

}
