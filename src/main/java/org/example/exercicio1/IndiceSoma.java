package org.example.exercicio1;

public class IndiceSoma {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while(k < indice) {
            k++;
            soma = soma + k;
        }

        System.out.println(soma);
    }
}