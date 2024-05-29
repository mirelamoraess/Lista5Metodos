package exercicio03;

public class Calculo {
    // Método para calcular o valor total a ser pago pelo empréstimo (acréscimo de 35%)
    public static double calcularValorTotalEmprestimo(double valorEmprestimo) {
        return valorEmprestimo * 1.35;
    }

    // Método para calcular o valor da parcela mensal (empréstimo pago em 24 meses)
    public static double calcularValorParcela(double valorTotal) {
        return valorTotal / 24;
    }
}
