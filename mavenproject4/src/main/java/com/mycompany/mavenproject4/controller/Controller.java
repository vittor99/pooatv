package com.mycompany.mavenproject4.controller;

import com.mycompany.mavenproject4.model.Model;
import com.mycompany.mavenproject4.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void executar() {
        double numero1 = view.getNumero("Digite o primeiro número: ");
        double numero2 = view.getNumero("Digite o segundo número: ");
        double numero3 = view.getNumero("Digite o terceiro número: ");
        
        model.setNumeros(numero1, numero2, numero3);
        
        double maior = model.encontrarMaior();
        double menor = model.encontrarMenor();
        
        view.exibirResultado(maior, menor);
    }
}
