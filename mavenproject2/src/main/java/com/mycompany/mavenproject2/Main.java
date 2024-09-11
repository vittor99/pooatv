package com.mycompany.mavenproject2;

import com.mycompany.mavenproject2.controller.Controller;
import com.mycompany.mavenproject2.model.Model;
import com.mycompany.mavenproject2.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.calculateAndDisplayRequiredCans();
    }
}
