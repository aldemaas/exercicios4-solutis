package src.animais;

import src.abstracts.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {

    public Peixe(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, idade, habitat, altura, peso);
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando.");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}
