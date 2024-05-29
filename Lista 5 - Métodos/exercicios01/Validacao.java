package exercicio01;

public class Validacao {
    // Método que valida se a nota está entre 0 e 10
    public static boolean validarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            return true;
        } else {
            System.out.println("Nota inválida! Informe novamente.");
            return false;
        }
    }
}
