package org.example.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestFibonacci {

    public static List<Integer> fibonacci = new ArrayList<>();

    public static void main(String[] args) {
        fibonacci.add(0);
        fibonacci.add(1);

        Scanner scanner = new Scanner(System.in);
        int numero;

        while(true) {
            System.out.println("Sequência de fibonacci " + fibonacci);
            System.out.println("informe o numero que da sequencia de fibonacci: ");
            numero = scanner.nextInt();

            if (!isFibonacci(numero)) {
                System.out.println("Este número não pertence a sequência");
                break;
            }
        }
    }

        public static boolean isFibonacci(int numero) {

            int ultimoElemento = fibonacci.get(fibonacci.size() - 1);
            int penultimoElemento = fibonacci.get(fibonacci.size() - 2);
            int soma = ultimoElemento + penultimoElemento;


            return (numero == soma) ? fibonacci.add(soma) : false;

        }

}
