package src.animais;

import src.abstracts.AnimalTerrestreAB;

public class Leao extends AnimalTerrestreAB {

    public Leao(String nome, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    @Override
    public void andar() {
        System.out.println(nome + " está andando.");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}
