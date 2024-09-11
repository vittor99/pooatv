package com.mycompany.mavenproject5.view;

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

    public void exibirNumerosEmOrdem(double[] numeros) {
        System.out.print("Os números em ordem crescente são: ");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    
    public void fechar() {
        scanner.close();
    }
}
