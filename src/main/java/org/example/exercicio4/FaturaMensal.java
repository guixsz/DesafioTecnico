package org.example.exercicio4;

public class FaturaMensal {

    public static void main(String[] args) {
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        double faturamentoTotal =  faturamentoES + faturamentoMG + faturamentoRJ + faturamentoSP + faturamentoOutros;

        double percenturalSP = (faturamentoSP / faturamentoTotal) * 100;
        double percenturalRJ = (faturamentoRJ / faturamentoTotal) * 100;
        double percenturalMG = (faturamentoMG / faturamentoTotal) * 100;
        double percenturalES = (faturamentoES / faturamentoTotal) * 100;
        double percenturalOutros = (faturamentoOutros / faturamentoTotal) * 100;

        System.out.printf("SP: %.2f%%\n", percenturalSP);
        System.out.printf("RJ: %.2f%%\n", percenturalRJ);
        System.out.printf("MG: %.2f%%\n", percenturalMG);
        System.out.printf("ES: %.2f%%\n", percenturalES);
        System.out.printf("Outros: %.2f%%\n", percenturalOutros);
    }
}
