package br.edu.seuprojeto;

import br.edu.seuprojeto.modelo.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex", 3, "Labrador");
        Gato gato = new Gato("Mimi", 2, "Branco");

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);

        for (Animal animal : animais) {
            System.out.println(animal);
            animal.fazerSom();
            System.out.println("--------");
        }
    }
}