package src.animais;

import src.abstracts.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {

    public Pombo(String nome, int idade, String habitat, double altura, double peso, int quantidadeAssas, double envergaduraAssa) {
        super(nome, idade, habitat, altura, peso, quantidadeAssas, envergaduraAssa);
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando.");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}
