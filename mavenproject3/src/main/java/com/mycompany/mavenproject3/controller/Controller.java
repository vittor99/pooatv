package com.mycompany.mavenproject3.controller;

import com.mycompany.mavenproject3.model.Model;
import com.mycompany.mavenproject3.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void executar() {
        double nota1 = view.getNota("Digite a primeira nota: ");
        double nota2 = view.getNota("Digite a segunda nota: ");
        double nota3 = view.getNota("Digite a terceira nota: ");
        double nota4 = view.getNota("Digite a quarta nota: ");
        
        model.setNotas(nota1, nota2, nota3, nota4);
        
        double media = model.calcularMedia();
        view.exibirMedia(media);
    }
}
