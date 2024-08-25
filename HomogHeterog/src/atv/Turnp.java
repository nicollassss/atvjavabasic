package atv;

import java.util.Scanner;

public class Turnp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a hora de inicio do turno (0h-23h)");
		String horario = scanner.next();
		
		int hora = Integer.parseInt(horario.replace("h", ""));
		
		String turno;
		if (hora >= 5 && hora < 13) {
			turno = "Você é do turno da manhã";
		} else if (hora >= 13 && hora < 21) {
			turno = "Você é do turno da tarde";
		} else {
     		turno = "Você é do turno da noite";
		}
		
		System.out.println(turno);
		
		scanner.close();

	}

}
