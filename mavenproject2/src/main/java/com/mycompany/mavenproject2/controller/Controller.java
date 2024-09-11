package com.mycompany.mavenproject2.controller;

import com.mycompany.mavenproject2.model.Model;
import com.mycompany.mavenproject2.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void calculateAndDisplayRequiredCans() {
        double width = view.getWallWidth();
        double height = view.getWallHeight();

        model.setWallDimensions(width, height);
        int requiredCans = model.calculateRequiredCans();

        view.displayRequiredCans(requiredCans);
    }
}
