package pao;

import java.util.Scanner; 

public class Pao {
	
	public static void main(String[] args) {
		yuriCLT();
	}
	

	public static void yuriCLT() {
		Scanner input = new Scanner(System.in); 
		System.out.println("Com o número 1 sendo verão, 2 sendo outono, 3 sendo inverno, 4 sendo primavera ");
		int codigo = input.nextInt();
		
		if  (codigo == 1) {
			System.out.println("É verão, está quente");
			
		} 
		if (codigo == 2 ) {
			System.out.println("É outono, está...");
		} 
		if  (codigo == 3) {
			System.out.println("É inverno, está...");
		} 
		else { 
			System.out.println("É primavera , está...");
		}

	}

}
