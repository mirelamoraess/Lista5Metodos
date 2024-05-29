package exercicio01;

public class Resultado {
    // Método que mostra se o aluno foi aprovado ou reprovado
    public static void mostrarResultado(double media) {
        if (media >= 7) {
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }
    }
}
