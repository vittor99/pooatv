package com.mycompany.mavenproject4.model;

public class Model {
    private double numero1;
    private double numero2;
    private double numero3;

    public void setNumeros(double numero1, double numero2, double numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public double encontrarMaior() {
        return Math.max(numero1, Math.max(numero2, numero3));
    }

    public double encontrarMenor() {
        return Math.min(numero1, Math.min(numero2, numero3));
    }
}
