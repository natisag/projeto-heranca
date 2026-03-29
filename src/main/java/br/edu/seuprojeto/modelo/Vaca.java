package br.edu.seuprojeto.modelo;

public class Vaca extends Animal {
    private String cor;

    public Vaca(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " diz: Muuu!");
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cor: " + cor;
    }
}