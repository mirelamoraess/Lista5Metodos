package exercicio02;

public class Calculo {
    // Método para calcular o desconto do INSS (20% do salário bruto)
    public static double calcularINSS(double salarioBruto) {
        return salarioBruto * 0.20;
    }

    // Método para calcular o desconto do IRPF (10% do salário bruto)
    public static double calcularIRPF(double salarioBruto) {
        return salarioBruto * 0.10;
    }

    // Método para calcular o desconto do plano de saúde (5% do salário bruto)
    public static double calcularPlanoSaude(double salarioBruto) {
        return salarioBruto * 0.05;
    }

    // Método para calcular o acréscimo de horas extras
    public static double calcularHorasExtras(double salarioBruto, double horasExtras) {
        // Valor da hora normal de trabalho
        double valorHora = salarioBruto / 160;
        // Cada hora extra vale 50% a mais do valor da hora normal
        return horasExtras * valorHora * 1.5;
    }

    // Método para calcular o salário líquido
    public static double calcularSalarioLiquido(double salarioBruto, double descontoINSS, double descontoIRPF, double descontoPlanoSaude, double acrescimoHorasExtras) {
        // Salário líquido = salário bruto - descontos + acréscimo de horas extras
        return salarioBruto - descontoINSS - descontoIRPF - descontoPlanoSaude + acrescimoHorasExtras;
    }
}
