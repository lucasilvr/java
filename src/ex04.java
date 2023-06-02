//Um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário

import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int id_func;
		double num_htrab, valor_h, salario;

		id_func = sc.nextInt();
		num_htrab = sc.nextDouble();
		valor_h = sc.nextDouble();

		salario = num_htrab * valor_h;

		System.out.println("O numero do funcionario é: " + id_func);
		System.out.printf("O salario do funcionario é: RS$%.2f", salario);

		sc.close();

	}

}
