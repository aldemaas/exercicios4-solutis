package src.abstracts;

public abstract class AnimalTerrestreAB extends AnimalAB {
    protected int quantidadePatas;

    public AnimalTerrestreAB(String nome, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, "Terrestre", idade, habitat, altura, peso);
        this.quantidadePatas = quantidadePatas;
    }

    public abstract void andar();

    @Override
    public void moverse() {
        andar();
    }
}
