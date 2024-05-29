package exercicio02;

public class Principal {
    public static void main(String[] args) {
        // Recebe o salário bruto do usuário
        double salarioBruto = EntradaSaida.receberSalario();
        // Recebe a quantidade de horas extras trabalhadas
        double horasExtras = EntradaSaida.receberHorasExtras();

        // Calcula os descontos e acréscimos
        double descontoINSS = Calculo.calcularINSS(salarioBruto);
        double descontoIRPF = Calculo.calcularIRPF(salarioBruto);
        double descontoPlanoSaude = Calculo.calcularPlanoSaude(salarioBruto);
        double acrescimoHorasExtras = Calculo.calcularHorasExtras(salarioBruto, horasExtras);

        // Calcula o salário líquido
        double salarioLiquido = Calculo.calcularSalarioLiquido(salarioBruto, descontoINSS, descontoIRPF, descontoPlanoSaude, acrescimoHorasExtras);

        // Mostra a folha de pagamento ao usuário
        EntradaSaida.mostrarFolhaPagamento(salarioBruto, descontoINSS, descontoIRPF, descontoPlanoSaude, acrescimoHorasExtras, salarioLiquido);
    }
}
