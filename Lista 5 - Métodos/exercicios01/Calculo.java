package exercicio01;

public class Calculo {
    // Método para calcular a média aritmética
    public static double calcularMediaAritmetica(double[] notas) {
        return (notas[0] + notas[1]) / 2;
    }

    // Método para calcular a média ponderada
    public static double calcularMediaPonderada(double[] notas, double[] pesos) {
        return (notas[0] * pesos[0] + notas[1] * pesos[1]) / (pesos[0] + pesos[1]);
    }
}
