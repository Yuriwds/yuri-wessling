package ProssRevExerc;

import java.util.Scanner;

public class Exerc1 {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Insira o número da estação");
	int estacao = input.nextInt();
	 
	
	if (estacao == 1) {
		imprimirVerao();
	} else if (estacao == 2) {
		imprimirOutono();
	} else if (estacao == 3) {
		imprimirInverno();
	} else if (estacao == 4) {
		imprimirPrimavera();
	} else {
		System.out.println("Escolha errada");
	}
	
	
	
	}
 public static void imprimirVerao() {
		System.out.println("É verão");
		System.out.println("Está calor ");
		
} 
 public static void imprimirOutono() {
	 System.out.println("É outono");
	 System.out.println("Está florecendo");
 }
 public static void imprimirInverno() {
	 System.out.println("É inverno ");
	 System.out.println("Está esfriando");
	 
 }
 public static void imprimirPrimavera() {
	 System.out.println("É primavera");
	 System.out.println("As flores estão caindo");
 }
}
