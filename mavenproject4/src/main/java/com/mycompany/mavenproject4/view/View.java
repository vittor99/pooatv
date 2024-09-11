package com.mycompany.mavenproject4.view;

import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public double getNumero(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public void exibirResultado(double maior, double menor) {
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
    
    public void fechar() {
        scanner.close();
    }
}
