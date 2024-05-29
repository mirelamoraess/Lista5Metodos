package exercicio01;

import java.util.Scanner;

public class EntradaSaida {
    static Scanner scanner = new Scanner(System.in);

    // Método para receber as notas do aluno
    public static double[] receberNotas() {
        double[] notas = new double[2];
        for (int i = 0; i < 2; i++) {
            do {
                System.out.print("Informe a nota " + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();
            } while (!Validacao.validarNota(notas[i])); // Valida a nota
        }
        return notas;
    }

    // Método para receber o tipo de média desejada
    public static String receberTipoMedia() {
        System.out.print("Informe o tipo de média desejada (Aritmetica/Ponderada): ");
        return scanner.next();
    }

    // Método para receber os pesos das notas
    public static double[] receberPesos() {
        double[] pesos = new double[2];
        System.out.print("Informe o peso da nota 1: ");
        pesos[0] = scanner.nextDouble();
        System.out.print("Informe o peso da nota 2: ");
        pesos[1] = scanner.nextDouble();
        return pesos;
    }
}
