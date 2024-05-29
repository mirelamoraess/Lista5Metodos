package exercicio01;

public class Principal {
    public static void main(String[] args) {
        // Recebe as notas do aluno
        double[] notas = EntradaSaida.receberNotas();
        double media;

        // Verifica qual tipo de média o professor deseja calcular
        if (EntradaSaida.receberTipoMedia().equalsIgnoreCase("Aritmetica")) {
            // Calcula a média aritmética
            media = Calculo.calcularMediaAritmetica(notas);
        } else {
            // Recebe os pesos e calcula a média ponderada
            double[] pesos = EntradaSaida.receberPesos();
            media = Calculo.calcularMediaPonderada(notas, pesos);
        }

        // Mostra o resultado final (aprovado ou reprovado)
        Resultado.mostrarResultado(media);
    }
}
