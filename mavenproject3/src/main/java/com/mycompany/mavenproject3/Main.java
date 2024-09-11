package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.controller.Controller;
import com.mycompany.mavenproject3.model.Model;
import com.mycompany.mavenproject3.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.executar();
        
        view.fechar();
    }
}
