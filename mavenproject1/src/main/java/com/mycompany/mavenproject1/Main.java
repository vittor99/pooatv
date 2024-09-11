package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.controller.Controller;
import com.mycompany.mavenproject1.model.Model;
import com.mycompany.mavenproject1.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.calcularLucro();
    }
}
