package com.mycompany.mavenproject1.controller;

import com.mycompany.mavenproject1.model.Model;
import com.mycompany.mavenproject1.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void calcularLucro() {
        double custo = view.getDoubleInput("Entre com o custo da mercadoria: ");
        double frete = view.getDoubleInput("Entre com o valor do frete: ");
        double despesas = view.getDoubleInput("Entre com as despesas eventuais: ");
        double valorVenda = view.getDoubleInput("Entre com o valor de venda: ");

        model.setCusto(custo);
        model.setFrete(frete);
        model.setDespesas(despesas);
        model.setValorVenda(valorVenda);

        double lucro = model.calcularLucro();
        view.mostrarResultado("A porcentagem de lucro é: " + lucro + "%");
    }
}
