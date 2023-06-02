
//Programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais.
import java.util.Scanner;
import java.util.Locale;

public class ex02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double r_c, area, pi;
		pi = 3.14159;
		r_c = sc.nextDouble();

		area = pi * (r_c * r_c);

		System.out.printf("A = %.4f", area);

		sc.close();

	}

}
