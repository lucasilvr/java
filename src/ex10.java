//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		int hora_inicio = sc.nextInt();
		int hora_final = sc.nextInt();
		
		int duracao;
		if (hora_inicio < hora_final) {
			duracao = hora_final - hora_inicio;
		}
		else {
			duracao = 24 - hora_inicio + hora_final;
		}
		
		System.out.println("o jogo durou " + duracao + " hora(s)");
		
		sc.close();

	}
	
}