package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		
		int dividendo;
		int divisor;
		boolean loop = true;

		do {
			try {

				System.out.println("Digite o dividendo: ");
				dividendo = ler.nextInt();

				System.out.println("Digite o divisor: ");
				divisor = ler.nextInt();

				divide(dividendo, divisor);

			} catch (InputMismatchException e) {
                  System.err.println("Excessão " + e);
                  ler.nextLine();
                  System.out.println("\n Digite valores inteiros !!");
			}catch (ArithmeticException e) {
                System.err.println("Excessão " + e);
                ler.nextLine();
                System.out.println("\n Não é possível dividir por zero !!");
			}finally {
				System.out.println("\n É um alerta!!!!");
			}

		} while (loop);
	}

	public static void divide(int dividendo, int divisor) {

		System.out.println("Resultado da divisão = " + (dividendo / divisor));
	}
}
