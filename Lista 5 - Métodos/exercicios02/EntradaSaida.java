package exercicio02;

import java.util.Scanner;

public class EntradaSaida {
    static Scanner scanner = new Scanner(System.in);

    // Método para receber o salário bruto do usuário
    public static double receberSalario() {
        double salario;
        do {
            System.out.print("Informe o salário bruto: ");
            salario = scanner.nextDouble();
        } while (!Validacao.validarSalario(salario)); // Valida se o salário está entre 500 e 30000
        return salario;
    }

    // Método para receber a quantidade de horas extras trabalhadas
    public static double receberHorasExtras() {
        System.out.print("Informe a quantidade de horas extras: ");
        return scanner.nextDouble();
    }

    // Método para mostrar a folha de pagamento ao usuário
    public static void mostrarFolhaPagamento(double salarioBruto, double descontoINSS, double descontoIRPF, double descontoPlanoSaude, double acrescimoHorasExtras, double salarioLiquido) {
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto INSS: " + descontoINSS);
        System.out.println("Desconto IRPF: " + descontoIRPF);
        System.out.println("Desconto Plano de Saúde: " + descontoPlanoSaude);
        System.out.println("Acréscimo Horas Extras: " + acrescimoHorasExtras);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}
