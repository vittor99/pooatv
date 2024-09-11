package com.mycompany.mavenproject5.model;

import java.util.Arrays;

public class Model {
    private double[] numeros = new double[3];

    public void setNumeros(double numero1, double numero2, double numero3) {
        numeros[0] = numero1;
        numeros[1] = numero2;
        numeros[2] = numero3;
    }

    public double[] ordenarEmOrdemCrescente() {
        double[] numerosOrdenados = numeros.clone();
        Arrays.sort(numerosOrdenados);
        return numerosOrdenados;
    }
}
