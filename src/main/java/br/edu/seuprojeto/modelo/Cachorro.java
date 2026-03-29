package br.edu.seuprojeto.modelo;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " diz: Au Au Au!");
    }

    public String getRaca() {
        return raca;
    }
}