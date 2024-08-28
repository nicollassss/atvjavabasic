import java.util.Scanner;

public class Natação {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Idade: ");
		        int idade = scanner.nextInt();     
		        
		        if (idade >= 5 && idade <= 7) {
		            System.out.println("Infantil A");
		        } else if (idade >= 8 && idade <= 10) {
		            System.out.println("Infantil B");
		        } else if (idade >= 11 && idade <= 13) {
		            System.out.println("Juvenil A");
		        } else if (idade >= 14 && idade <= 17) {
		            System.out.println("Juvenil B");
		        } else if (idade >= 18) {
		            System.out.println("Sênior");
		        } else {
		            System.out.println("Dê meia volta e procure outro lugar.");
		        }
		        
		        scanner.close();
		    }
}
