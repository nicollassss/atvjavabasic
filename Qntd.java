package atv;

import java.util.Scanner;

public class Qntd {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        /* fiz mais do que foi pedido e montei a mesma situação pra qualquer valor
	         * da pra colocar do 10 ate o 10000000000 por exemplo*/
	        
	   
	        System.out.print("Primeiro número: ");
	        int inicio = scanner.nextInt();
	        //digita o primeiro numero
	        
	        System.out.print("Segundo número: ");
	        //agora o segundo
	        
	        int fim = scanner.nextInt();
	        int quantidade = 0;
	        // quantidade é 0 porque nao foi definido ainda, se fosse 2 por exemplo, ia adicionar dois ao valor final
	        
	        if (inicio > fim) {
	            System.out.println("Qual foi paizaokkkkkkkkkk, ce nao fez isso nao ne? o primeiro valor tem que ser maior");
	            
	        } else {
	            for (int i = inicio; i <= fim; i++) {
	                quantidade++;
	            }

	            System.out.println("A quantidade de números entre " + inicio + " e " + fim + " é: " + quantidade + ".");
	            //exibe ao usuario o valor 
	        }

	      
	        scanner.close();
	}

}
