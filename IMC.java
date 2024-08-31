package atv;

import java.util.Scanner;
//import scanner

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //abre scanner

        System.out.print("Insira seu peso (em kg)");
        double peso = scanner.nextDouble();
        //solicita peso
        
        System.out.print("Insira sua altura em metros (1,75 por ex)");
        double altura = scanner.nextDouble();
        //solicita altura (1,80 por exemplo)

        double imc = peso / (altura * altura);
        //realiza o calculo do IMC

        System.out.printf("Seu IMC é: %.2f\n", imc);
        //exibe seu resultado
        //%.2f\n formata a saida de um valor double

        if (imc < 18.0) {
            System.out.println("Magreza");
            
        } else if (imc >= 18.0 && imc <= 24.9) {
            System.out.println("Saudável");
            
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");
            
        } else if (imc >= 30){
            System.out.println("Obesidade");
        }  
        //realiza os calculos atraves da tabela de valores fornecida

        scanner.close();
        //fecha o scanner
    }
}
