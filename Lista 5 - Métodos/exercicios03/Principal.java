package exercicio03;

public class Principal {
    public static void main(String[] args) {
        // Recebe o salário atual da pessoa
        double salario = EntradaSaida.receberSalario();
        // Recebe o valor do empréstimo desejado
        double valorEmprestimo = EntradaSaida.receberValorEmprestimo();

        // Calcula o valor total a ser pago pelo empréstimo (acréscimo de 35%)
        double valorTotal = Calculo.calcularValorTotalEmprestimo(valorEmprestimo);
        // Calcula o valor da parcela mensal
        double valorParcela = Calculo.calcularValorParcela(valorTotal);

        // Verifica se o usuário pode realizar o empréstimo
        if (Validacao.validarEmprestimo(salario, valorEmprestimo, valorParcela)) {
            // Mostra os detalhes do empréstimo
            EntradaSaida.mostrarDetalhesEmprestimo(valorEmprestimo, valorTotal, valorParcela);
        } else {
            System.out.println("Empréstimo não aprovado. O valor da parcela excede 15% do salário.");
        }
    }
}
