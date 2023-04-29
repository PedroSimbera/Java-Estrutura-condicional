import java.util.Scanner;

public class ifPositivoNegativo {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double num; 
		num = n.nextDouble();
			
			if (num<0) {
				System.out.println("Número negativo");
			}
			else {
				System.out.println("Número positivo");
			} 
			
			n.close();
	}

}
