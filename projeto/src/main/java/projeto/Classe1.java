package projeto;

import java.util.Scanner;

public class Classe1 {

	public static void main(String[] args) { 
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe a matricula do funcionário");
		int matricula = input.nextInt();
		System.out.println("Informe seu nome ");
		String  nome = input.next();
		System.out.println("Informe quantas horas você trabalha");
		int horast = input.nextInt(); 
		System.out.println("Informe quantos ganha por hora");
		int gt = input.nextInt();  
		int ganhomensal = horast*gt*28;
		System.out.println(" Matricula \n"  + matricula + " Nome \n" + nome + " Salário \n" + ganhomensal);
				
		
 
	}

}
