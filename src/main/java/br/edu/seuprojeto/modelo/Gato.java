package br.edu.seuprojeto.modelo;

public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " diz: Miau!");
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Gato";
    }
}
