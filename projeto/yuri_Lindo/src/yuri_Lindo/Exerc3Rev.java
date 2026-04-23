package yuri_Lindo;

import java.util.Scanner;

public class Exerc3Rev {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Informe o preço do primeiro produto");
		double preço = input.nextDouble();
		
		System.out.println("Informe o preço do segundo produto");
		double preço2 = input.nextDouble();
		
		System.out.println("Infomre o preço do terceiro produto");
		double preço3 = input.nextDouble();
		
		double somap = preço + preço2 + preço3;
		
		System.out.println("A soma dos produtos é " + somap);
	}

}
