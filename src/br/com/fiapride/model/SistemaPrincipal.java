package br.com.fiapride.model;

import br.com.fiapride.model.Pet;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Pet meuPet = new Pet();
        meuPet.nome = "Cinderella";
        meuPet.especie = "Cachorro";
        meuPet.idade = 6;

        Pet petDoProfessor = new Pet();
        petDoProfessor.nome = "Thor";
        petDoProfessor.especie = "Gato";
        petDoProfessor.idade = 2;

        System.out.println("Meu pet é: " + meuPet.nome);
        System.out.println("O pet do professor é: " + petDoProfessor.nome);
    }
}