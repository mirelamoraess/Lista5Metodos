package exercicio03;

import java.util.Scanner;

public class EntradaSaida {
    static Scanner scanner = new Scanner(System.in);

    // Método para receber o salário atual da pessoa
    public static double receberSalario() {
        double salario;
        do {
            System.out.print("Informe seu salário atual: ");
            salario = scanner.nextDouble();
        } while (!Validacao.validarSalario(salario)); // Valida se o salário está entre 500 e 30000
        return salario;
    }

    // Método para receber o valor do empréstimo desejado
    public static double receberValorEmprestimo() {
        double valorEmprestimo;
        do {
            System.out.print("Informe o valor do empréstimo desejado: ");
            valorEmprestimo = scanner.nextDouble();
        } while (!Validacao.validarValorEmprestimo(valorEmprestimo)); // Valida se o valor do empréstimo está no limite permitido
        return valorEmprestimo;
    }

    // Método para mostrar os detalhes do empréstimo
    public static void mostrarDetalhesEmprestimo(double valorEmprestimo, double valorTotal, double valorParcela) {
        System.out.println("Empréstimo aprovado!");
        System.out.println("Valor do Empréstimo: " + valorEmprestimo);
        System.out.println("Valor Total a Pagar (com juros): " + valorTotal);
        System.out.println("Valor da Parcela Mensal: " + valorParcela);
    }
}

