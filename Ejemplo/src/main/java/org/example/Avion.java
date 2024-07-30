package org.example;

public abstract class Avion {
    protected int capacidadCombustible;
    protected int consumoCombustible;

    public Avion(int capacidadCombustible, int consumoCombustible) {
        this.capacidadCombustible = capacidadCombustible;
        this.consumoCombustible = consumoCombustible;
    }

    public abstract int volar(int distancia);

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }
}