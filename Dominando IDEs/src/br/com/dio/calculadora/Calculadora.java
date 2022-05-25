package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o 1� n�mero: ");
		double a = leia.nextDouble();
		System.out.print("Digite o 2� n�mero: ");
		double b = leia.nextDouble();

		System.out.print("\nA soma dos n�meros �: "+soma(a, b));
		System.out.print("\nA subtra��o dos n�meros �: "+sub(a, b));
		System.out.print("\nA multiplica��o dos n�meros �: "+mult(a, b));
		System.out.print("\nA divis�o dos n�meros �: "+div(a, b));
		leia.close();
	}
	
	public static double soma(double a, double b) {
		return a + b;
	}
	public static double sub(double a, double b) {
		return a - b;
	}
	public static double mult(double a, double b) {
		return a * b;
	}
	public static double div(double a, double b) {
		return a / b;
	}
}
