package src;

import src.animais.*;

public class Main {

    public static void main(String[] args) {
        // Testando um Cachorro
        Cachorro cachorro = new Cachorro("Rex", 5, "Doméstico", 0.5, 20.0, 4);
        System.out.println("Cachorro:");
        cachorro.comer();
        cachorro.moverse();
        cachorro.dormir();
        System.out.println();

        // Testando um Gato
        Gato gato = new Gato("Mimi", 3, "Doméstico", 0.3, 5.0, 4);
        System.out.println("Gato:");
        gato.comer();
        gato.moverse();
        gato.dormir();
        System.out.println();

        // Testando um Elefante
        Elefante elefante = new Elefante("Dumbo", 10, "Selva", 3.0, 5000.0, 4);
        System.out.println("Elefante:");
        elefante.comer();
        elefante.moverse();
        elefante.dormir();
        System.out.println();

        // Testando um Leão
        Leao leao = new Leao("Simba", 8, "Savanas", 1.2, 190.0, 4);
        System.out.println("Leão:");
        leao.comer();
        leao.moverse();
        leao.dormir();
        System.out.println();

        // Testando um Peixe
        Peixe peixe = new Peixe("Nemo", 2, "Oceano", 0.1, 1.0);
        System.out.println("Peixe:");
        peixe.comer();
        peixe.moverse(); // que chama nadar
        peixe.dormir();
        System.out.println();

        // Testando um Pombo
        Pombo pombo = new Pombo("Pombinho", 1, "Urbano", 0.2, 0.5, 2, 0.4);
        System.out.println("Pombo:");
        pombo.comer();
        pombo.moverse(); // que chama voar
        pombo.dormir();
    }


}
