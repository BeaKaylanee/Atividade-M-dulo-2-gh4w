package exception;

import java.util.Scanner;

public class Throw {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			System.out.println("Digite sua idade: ");
			int idade = ler.nextInt();

			verificarIdade(idade);
			System.out.println("Entrada permitida. Bem-vindo(a) ao evento!");

		} catch (IdadeInvalidaException e) {
			System.err.println("\nExceção: " + e.getMessage());
		}
	}

	public static void verificarIdade(int idade) {
		if (idade < 18) {
			throw new IdadeInvalidaException("Acesso negado! Você deve ter pelo menos 18 anos de idade.");
		}
	}
}
