package src.abstracts;

import src.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected String tipoAnimal;

    protected int idade;

    protected String habitat;
    protected int quantidadePatas;
    protected int quantidadeAssas;
    protected double envergaduraAssa;

    protected double altura;

    protected double peso;
    protected int comidaIngerida = 0;
    protected int distanciaTotal = 0;
    protected int horasDormidas = 0;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadePatas = quantidadePatas;
        this.altura = altura;
        this.peso = peso;
    }
    @Override
    public abstract void comer(int quantidade);

    @Override
    public abstract void moverse(double distancia);

    @Override
    public abstract void dormir(int horas);
}

