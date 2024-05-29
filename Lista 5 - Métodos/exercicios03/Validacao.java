package exercicio03;

public class Validacao {
    // Método que valida se o salário está entre 500 e 30000
    public static boolean validarSalario(double salario) {
        if (salario >= 500 && salario <= 30000) {
            return true;
        } else {
            System.out.println("Salário inválido! Informe um valor entre 500 e 30000.");
            return false;
        }
    }

    // Método que valida se o valor do empréstimo está no limite permitido (até 200000)
    public static boolean validarValorEmprestimo(double valorEmprestimo) {
        if (valorEmprestimo > 0 && valorEmprestimo <= 200000) {
            return true;
        } else {
            System.out.println("Valor de empréstimo inválido! Informe um valor até 200000.");
            return false;
        }
    }

    // Método que verifica se o valor da parcela não ultrapassa 15% do salário
    public static boolean validarEmprestimo(double salario, double valorEmprestimo, double valorParcela) {
        return valorParcela <= (salario * 0.15);
    }
}
