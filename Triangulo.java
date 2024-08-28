import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe os três valores A, B e C
        System.out.print("Digite o valor de A (em cm): ");
        int A = scanner.nextInt();
        
        System.out.print("Digite o valor de B (em cm): ");
        int B = scanner.nextInt();
        
        System.out.print("Digite o valor de C (em cm): ");
        int C = scanner.nextInt();

        if (A + B > C && A + C > B && B + C > A) {
            if (A == B && B == C) {
                System.out.println("triângulo equilátero.");
            } else if (A == B || A == C || B == C) {
                System.out.println("triângulo isósceles.");
            } else {
                System.out.println("triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        scanner.close();
    }
}
