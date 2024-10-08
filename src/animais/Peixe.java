package src.animais;

import src.abstracts.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {
    public Peixe(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Peixe", idade, habitat, altura, peso);
    }
    @Override
    public void comer(int quantidade) {
        comidaIngerida += quantidade;
    }

    @Override
    public void moverse(double distancia) {
        nadar(distancia);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
    }

    @Override
    public void nadar(double distancia) {
        distanciaTotal += distancia;
    }
}
