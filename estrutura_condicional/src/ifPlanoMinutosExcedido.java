import java.util.Scanner;

public class ifPlanoMinutosExcedido {

	public static void main(String[] args) {
Scanner minutos = new Scanner (System.in);
		
		System.out.println("Quantos minutos foram utilizados: ");
		Double min = minutos.nextDouble();
		Double plano;
		int plano_minuto;
		
		plano = 50.00;
		plano_minuto = 100;
		
		if (min<100) {
			System.out.println("Sua fatura neste mês é de R$ " + plano + " reais"); 
		}
		else {
			plano+= 2.0 * (min-plano_minuto);
			System.out.println("Sua fatura neste mês é de R$ " + plano + " reais");
		}
		
		
		
		
		
		
		minutos.close();
	}

}
