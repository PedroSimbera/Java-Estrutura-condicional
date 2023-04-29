import java.util.Scanner;

public class ifParImpar {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		double num;
		System.out.println("Digite um número: ");
		num = n.nextDouble();
		
		if (num % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		
		n.close();
	}

}
