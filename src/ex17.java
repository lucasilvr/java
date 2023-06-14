/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de 
teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada 
para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor 
tem peso 3 e o terceiro valor tem peso 5.*/

import java.util.Locale;
import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for (int x = 1; n>x; x++) {
			
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			double media = (valor1*2.0 + valor2*3.0 + valor3*5.0)/10.0; //dividir pela quantidade de pesos
			System.out.printf("média: %.1f ", media);
			
		}
		sc.close();
	}

}
