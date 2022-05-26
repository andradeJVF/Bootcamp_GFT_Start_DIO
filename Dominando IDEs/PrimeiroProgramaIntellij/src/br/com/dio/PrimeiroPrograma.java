package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato cat1 = new Gato();
        cat1.setNome("Garfield");
        cat1.setIdade(4);
        cat1.setCor("laranja com listras pretas");

        System.out.println();
        System.out.println("O gato se chama "+cat1.getNome()+", ele é "+cat1.getCor()+" e tem "+cat1.getIdade()+" anos de idade!");

        Livro book1 = new Livro("Vinte mil léguas submarinas", 290);

        System.out.println("Meu livro favorito é o "+book1.getTitulo()+" e eu já li "+book1.getNumPag()+" páginas!");

    }
}

class Livro {
    private String titulo;
    private int numPag;

    public Livro(String titulo, int numPag) {
        this.titulo = titulo;
        this.numPag = numPag;
    }

    public Livro() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}