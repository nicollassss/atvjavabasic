package atv;

import java.util.ArrayList;
import java.util.Scanner;

public class NumCrescente {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Solicita os limites ao usuário
		        System.out.print("Segundo número: ");
		        int inicio = scanner.nextInt();
		        
		        System.out.print("Primeiro número: ");
		        int fim = scanner.nextInt();
		       
		        if (inicio > fim) {
		            System.out.println("O primeiro número tem que ser menor que o segundo.");
		        } else {
		            //armazena numeros impares (odiei mexer com array)
		            ArrayList<Integer> impares = new ArrayList<>();
		            
		            //adiciona os números ímpares na lista
		            for (int i = inicio; i <= fim; i++) {
		                if (i % 2 != 0) {
		                    impares.add(i);
		                }
		            }
		           
		            System.out.println("Números ímpares entre " + inicio + " e " + fim + ":");
		            for (int numero : impares) {
		                System.out.println(numero);
		            }
		        }

		        //fecha o scanner
		        scanner.close();
	}

}
