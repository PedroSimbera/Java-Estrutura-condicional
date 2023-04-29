import java.util.Scanner;

public class ifMultiplos {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		Double num1,num2,troca;
		System.out.println("Digite dois números para averiguar se são múltiplos ");
	    num1 = n.nextDouble();
	    num2 = n.nextDouble();
	    
	    if (num1<num2) {
	    	troca = num1;
	    	num1 = num2;
	    	num2 = troca;
	    	
	    	if (num1 % troca == 0) {
	    		System.out.println("São múltiplos");
	    	}
	    	else {
	    		System.out.println("Não são múltiplos");
			}
	    }
	    else {
	    	if (num1 % num2 == 0) {
	    		System.out.println("São múltiplos");
	    	}
	    	else {
				System.out.println("Não são múltiplos");
			}
	    } 
	    n.close();
	}
}
