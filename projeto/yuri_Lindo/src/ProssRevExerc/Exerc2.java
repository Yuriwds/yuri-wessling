package ProssRevExerc;

import java.util.Scanner;

public class Exerc2 {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	
	System.out.println("Insira o nome dele");
	
	String nome = input.next();
	
	if(nome.equalsIgnoreCase("Daniel")) {
		dhenifer();
	}
	else if (nome.equalsIgnoreCase("Matheus"))
		kevin();
}
}