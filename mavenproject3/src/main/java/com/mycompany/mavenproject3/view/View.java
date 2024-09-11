package com.mycompany.mavenproject3.view;

import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public double getNota(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public void exibirMedia(double media) {
        System.out.println("A média das notas é: " + media);
    }
    
    public void fechar() {
        scanner.close();
    }
}
