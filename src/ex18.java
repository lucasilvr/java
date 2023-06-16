/* Um programa para ler um número N. Depois leia N pares de números e 
mostre a divisão do primeiro pelo segundo. Se o denominador for igual
a zero, mostrar a mensagem "divisao impossivel".*/

import java.util.Locale;
import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int c = sc.nextInt();
		
		for (int i=0; i<c; i++) {
			
			double x = sc.nextInt();
			double y = sc.nextInt();
			if (y == 0) {
				System.out.println("divisão impossível");
			}
			else {
				double z = x/y;
				System.out.println(z);
			}
				
			}
			
		
		
		
		
		
		
		
		
		sc.close();
	}

}
