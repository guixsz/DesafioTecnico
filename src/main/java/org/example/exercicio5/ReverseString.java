package org.example.exercicio5;

import java.util.Scanner;

public class ReverseString {

    public static String reverser(String texto) {

        String reverseString = "";
        for (int i = texto.length() - 1; i >= 0 ; i--) {
            reverseString = reverseString + texto.charAt(i);
        }

        return reverseString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algum texto: ");
        String texto = scanner.nextLine();
        System.out.println("Texto reverso: " + reverser(texto));
    }
}
