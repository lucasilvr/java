import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	int valor_1, valor_2, soma;
		
	valor_1 = sc.nextInt();
	valor_2 = sc.nextInt();
	
	soma = valor_1 + valor_2;
	
	System.out.println("soma = " + soma);
				
	sc.close();
	
	}

}
