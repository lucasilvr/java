/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int num = 0;
		int in = 0;
		int out= 0;
		for (int x=1; n>=x; x+=1) {
			num = sc.nextInt();
			if (num >=10 && num <=20) {
				in += 1;
			}
			else {
				out += 1;
			}		
		}
		System.out.println("IN = " + in);
		System.out.println("OUT = " + out);
      sc.close();
	}

}

