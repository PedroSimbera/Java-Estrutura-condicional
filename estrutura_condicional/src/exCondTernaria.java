import java.util.Scanner;

public class exCondTernaria {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		double preco, desconto,total;
		preco = sc.nextDouble();
		
		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		total = desconto + preco;
		System.out.println("Valor do desconto é: " + desconto + ". Valor total é: " + total);
		
		sc.close();
	}

}
