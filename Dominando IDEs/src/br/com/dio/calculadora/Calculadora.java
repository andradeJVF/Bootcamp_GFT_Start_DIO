package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o 1º número: ");
		double a = leia.nextDouble();
		System.out.print("Digite o 2º número: ");
		double b = leia.nextDouble();

		System.out.print("\nA soma dos números é: "+soma(a, b));
		System.out.print("\nA subtração dos números é: "+sub(a, b));
		System.out.print("\nA multiplicação dos números é: "+mult(a, b));
		System.out.print("\nA divisão dos números é: "+div(a, b));
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
