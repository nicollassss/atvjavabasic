package atv;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // Recebe as 4 notas do aluno
		        System.out.println("primeira nota: ");
		        double notaum = scanner.nextDouble();
		        
		        System.out.println("segunda nota: ");
		        double notadois = scanner.nextDouble();
		        
		        System.out.println("terceira nota: ");
		        double notatres = scanner.nextDouble();
		        
		        System.out.println("quarta nota: ");
		        double notaquatro = scanner.nextDouble();
		        
		        // Calcula a média
		        double media = (notaum + notadois + notatres + notaquatro) / 4.0;
		        
		        // Determina o conceito e o status de aprovação
		        char menção;
		        String situação;
		        
		        if (media >= 9.0) {
		            menção = 'A';
		            situação = "Aprovado";
		        } else if (media >= 7.0) {
		            menção = 'B';
		            situação = "Aprovado";
		        } else if (media >= 5.0) {
		            menção = 'C';
		            situação = "Aprovado";
		        } else if (media >= 2.5) {
		            menção = 'D';
		            situação = "Reprovado";
		        } else {
		            menção = 'E';
		            situação = "Reprovado";
		        }
		        
		        // Exibe o resultado
		        System.out.printf("Média: %.2f%n", media);
		        System.out.println("Você recebeu menção " + menção + ".");
		        System.out.println("Você foi " + situação + ".");
		        
		        scanner.close();
		    }


	}
