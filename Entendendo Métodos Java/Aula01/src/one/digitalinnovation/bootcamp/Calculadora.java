package one.digitalinnovation.bootcamp;

public class Calculadora {

    public static void soma(double num1, double num2){
        double res = num1 + num2;
        System.out.println("A soma dos números "+num1+" e "+num2+" é igual a: "+res);
    }
    public static void sub(double num1, double num2){
        double res = num1 - num2;
        System.out.println("A subtração dos números "+num1+" e "+num2+" é igual a: "+res);
    }
    public static void mult(double num1, double num2){
        double res = num1 * num2;
        System.out.println("A multiplicação dos números "+num1+" e "+num2+" é igual a: "+res);
    }
    public static void div(double num1, double num2){
        double res = num1 / num2;
        System.out.println("A divisão dos números "+num1+" e "+num2+" é igual a: "+res);
    }
}
