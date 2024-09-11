package com.mycompany.mavenproject4;

import com.mycompany.mavenproject4.controller.Controller;
import com.mycompany.mavenproject4.model.Model;
import com.mycompany.mavenproject4.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.executar();

        view.fechar();
    }
}
