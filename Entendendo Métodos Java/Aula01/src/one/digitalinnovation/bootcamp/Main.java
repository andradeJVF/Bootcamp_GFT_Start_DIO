package one.digitalinnovation.bootcamp;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício Calculadora\n");
        Calculadora.soma(3, 6);
        Calculadora.sub(9, 1.8);
        Calculadora.mult(7, 8);
        Calculadora.div(5, 2.5);

        //Mensagem
        System.out.println("\nExercício Mensagem\n");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(23);
        Mensagem.obterMensagem(15);

        //Empréstimo
        System.out.println("\nExercício Empréstimo\n");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1200, Emprestimo.getTresParcelas());
        Emprestimo.calcular(3200, 5);
    }
}
