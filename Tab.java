package atv;

import java.util.Scanner;

public class Tab {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        //o usuario precisa escrever ne kkkkkkk
		        
		        
		        System.out.println("Escreva um número: (1-10)");
		        //solicita um numero 
		        int numero = scanner.nextInt();
		        
		        
		        System.out.println("Tabuada do " + numero + ":");
		        for (int z = 1; z <= 10; z++) {
		            System.out.println(numero + " x " + z + " = " + (numero * z));
		        }
		        
		        // Fecha o scanner
		        scanner.close();

	}

}
