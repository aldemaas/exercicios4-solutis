package src.animais;

import src.abstracts.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, int idade, String habitat, double envergaduraAssa, double altura, double peso) {
        super(nome, "Pombo", idade, habitat, 2, envergaduraAssa, altura, peso);
    }
    @Override
    public void comer(int quantidade) {
        comidaIngerida += quantidade;
    }
    @Override
    public void moverse(double distancia) {
        voar(distancia);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
    }

    @Override
    public void voar(double distancia) {
        distanciaTotal += distancia;
    }
}
