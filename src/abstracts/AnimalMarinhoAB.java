package src.abstracts;

public abstract class AnimalMarinhoAB extends AnimalAB {
    public AnimalMarinhoAB(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Marinho", idade, habitat, altura, peso);
    }

    public abstract void nadar();

    @Override
    public void moverse() {
        nadar();
    }
}
