import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print ("Digite o 1° dia: ");
		int dia1 = scanner.nextInt();
		System.out.print ("Digite o 1° mês: ");
		int mes1 = scanner.nextInt();
		System.out.print ("Digite o 1° ano: ");
        int ano1 = scanner.nextInt();

        
        System.out.print ("Digite o 2° dia: ");
        int dia2 = scanner.nextInt();
        System.out.print ("Digite o 2° mês: ");
        int mes2 = scanner.nextInt();
        System.out.print ("Digite o 2° ano: ");
        int ano2 = scanner.nextInt();

        if (ano1 < ano2 || (ano1 == ano2 && mes1 < mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 < dia2)) {
            System.out.printf("Datas em ordem crescente: %02d/%02d/%d e %02d/%02d/%d\n", dia1, mes1, ano1, dia2, mes2, ano2);
        } else if (ano1 > ano2 || (ano1 == ano2 && mes1 > mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 > dia2)) {
            
            System.out.printf("Datas em ordem crescente: %02d/%02d/%d e %02d/%02d/%d\n", dia2, mes2, ano2, dia1, mes1, ano1);
        } else {
            System.out.printf("As datas não se alteram: %02d/%02d/%d\n", dia1, mes1, ano1);
        }

        scanner.close();
	}

}
