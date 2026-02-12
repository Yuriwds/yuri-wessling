import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		// Criando um objeto Scanner para ler a entrada do usuário
		Scanner input = new Scanner(System.in);

		System.out.println("Informe o preço do primeiro produto");
		double preco1 = input.nextDouble();

		System.out.println("Informe o preço do segundo produto");
		double preco2 = input.nextDouble();

		double somaPreco = preco1 + preco2;

		System.out.println("A soma dos produtos é de R$" + somaPreco);

	}
}
