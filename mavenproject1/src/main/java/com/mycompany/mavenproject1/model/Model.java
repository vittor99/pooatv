package com.mycompany.mavenproject1.model;

public class Model {
    private double custo;
    private double frete;
    private double despesas;
    private double valorVenda;


    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double calcularLucro() {
        double totalCusto = custo + frete + despesas;
        return (valorVenda - totalCusto) / totalCusto * 100;
    }
}
