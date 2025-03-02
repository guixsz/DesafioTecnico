package org.example.exericio3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class main {

    public static void main(String[] args) {
        try {
            // Carregar dados do JSON
            ObjectMapper mapper = new ObjectMapper();
            List<FaturamentoDia> faturamentoDiario = mapper.readValue(
                    new File("C:/Projects/testeTecbuci/src/main/java/org/example/exericio3/faturamento.json"),
                    new TypeReference<List<FaturamentoDia>>() {}
            );

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0.0;
            int diasComFaturamento = 0;

            for (FaturamentoDia dia : faturamentoDiario) {
                if (dia.getValor() > 0) {
                    if (dia.getValor() < menorFaturamento) {
                        menorFaturamento = dia.getValor();
                    }
                    if (dia.getValor() > maiorFaturamento) {
                        maiorFaturamento = dia.getValor();
                    }
                    somaFaturamento += dia.getValor();
                    diasComFaturamento++;
                }
            }

            double mediaFaturamento = somaFaturamento / diasComFaturamento;


            int diasAcimaDaMedia = 0;
            for (FaturamentoDia dia : faturamentoDiario) {
                if (dia.getValor() > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.printf("Menor faturamento: R$ %.2f\n", menorFaturamento);
            System.out.printf("Maior faturamento: R$ %.2f\n", maiorFaturamento);
            System.out.printf("Dias com faturamento acima da média: %d\n", diasAcimaDaMedia);

        } catch (IOException e) {
            new RuntimeException(e.getMessage());
        }
    }
}
