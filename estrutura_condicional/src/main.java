import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		Scanner escolha = new Scanner(System.in);
		
		int x = escolha.nextInt();
		
		System.out.println("Escolha uma banda de rock que recomendaremos músicas:");
        System.out.println("1 - Red Hot Chilli Peppers");
        System.out.println("2 - Maneskin");
        System.out.println("3 - Legião Urbana");
        System.out.println("4 - Iron Maiden");
        System.out.println("5 - Nirvana");
        System.out.println("6 - O Rappa");
        System.out.println("7 - Pitty");
		
		
		switch (x) {
		case 1:
			System.out.println("Red Hot Chilli Peppers");
            System.out.println("1 - Californication");
            System.out.println("2 - Scar Tissue");
            System.out.println("3 - Under The Bridge");
			break;
		case 2:
			System.out.println("Maneskin");
            System.out.println("1 - Beggin");
            System.out.println("2 - Zitti");
            System.out.println("3 - I Wanna Be Your Slave");
			break;
		case 3:
			System.out.println("Legião Urbana");
            System.out.println("1 - Tempo Perdido");
            System.out.println("2 - Pais e Filhos");
            System.out.println("3 - Faroeste Caboclo");
			break;
		case 4:
			 System.out.println("Iron Maiden");
             System.out.println("1 - Fear Of The Dark");
             System.out.println("2 - The Trooper");
             System.out.println("3 - Hallowed Be Thy Name");
			break;
		case 5:
			System.out.println("Nirvana");
            System.out.println("1 - Smells Like Teen Spirit");
            System.out.println("2 - Come As You Are");
            System.out.println("3 - Lithium");
			break;
		case 6:
			System.out.println("O Rappa");
            System.out.println("1 - Anjos (Pra Quem Tem Fé)");
            System.out.println("2 - Pescador de Ilusões");
            System.out.println("3 - O Que Sobrou do Céu");
			break;
		case 7:
			 System.out.println("Pitty");
             System.out.println("1 - Na Sua Estante");
             System.out.println("2 - Admirável Chip Novo");
             System.out.println("3 - Me Adora");
			break;
		default:
			System.out.println("valor invalido");
			break;
			
		}
	
		
		escolha.close();
	}
}