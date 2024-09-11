package com.mycompany.mavenproject1.view;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public double getDoubleInput(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    public void mostrarResultado(String message) {
        System.out.println(message);
    }
}
