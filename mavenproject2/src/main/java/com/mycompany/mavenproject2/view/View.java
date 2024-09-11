package com.mycompany.mavenproject2.view;

import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public double getWallWidth() {
        System.out.print("Digite a largura da parede (em metros): ");
        return scanner.nextDouble();
    }

    public double getWallHeight() {
        System.out.print("Digite a altura da parede (em metros): ");
        return scanner.nextDouble();
    }

    public void displayRequiredCans(int cans) {
        System.out.println("A quantidade de latas de tinta necessárias é: " + cans);
    }
}
