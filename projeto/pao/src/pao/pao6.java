//i.Pegue as três primeiras letras de seu sobrenome
//ii.Adicione a ele as duas primeiras letras de seu nome
//Seu sobrenome na série Star Wars:
//i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
//ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasceu
//Crie um método chamado generateStarWarsName que gera um nome completo Star
//Wars conforme descrito.
//Imprima o seu nome Star Wars
//As entradas serão os nomes completos.
//Para separar, por exemplo as três primeiras letras do seu sobrenome, use o método
//.substring() das Strings


package pao;

import java.util.Scanner;

 


public class pao6 {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu sobrenome");
		String a = input.next();
		System.out.println("Digite o seu nome");
		String b = input.next();
		String duasletras = b.substring(0,2);
		String tresletra = a.substring(0,3);
		System.out.println("A resposta é " + duasletras + tresletra );
		
		 	String starWarsName = generateStarWarsName(input);
	        System.out.println("Seu nome Star Wars completo é: " + starWarsName);

	        input.close();
		
		
		
	}
	
	
	
	public static String generateStarWarsName(Scanner input) {
		System.out.println("Digite seu sobrenome da sua mãe");
		String mae = input.next();
		System.out.println("Digite o seu nome da cidade onde voce nasceu");
		String nasceu = input.next();
		String duasletras = mae.substring(0,2);
		String tresletra = nasceu.substring(0,3);
		System.out.println("A resposta é " + duasletras + tresletra );
		return duasletras + tresletra;
		
	}

}
