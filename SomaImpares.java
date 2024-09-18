package atv;

import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        //po caba digitar
		        
		        System.out.print("Primeiro número: ");
		        int inicio = scanner.nextInt();
		        //escrever o primeiro numero
		        
		        System.out.print("Segundo número: ");
		        int fim = scanner.nextInt();
		        //escrever o segundo numero
		        
		        int somaImpares = 0;
		        //valor igual a 0 pois nao foi definido

		        if (inicio > fim) {
		            System.out.println("O número inicial precisa ser menor.");
		        } else {
		            //loop
		            for (int i = inicio; i <= fim; i++) {
		                if (i % 2 != 0) {
		                	//verificar se é impar ou par
		                    somaImpares += i;
		                }
		            }

		            
		            System.out.println("A soma dos números ímpares entre " + inicio + " e " + fim + " é: " + somaImpares);
		        }

		        // fecha o scanner
		        scanner.close();
	}

}
