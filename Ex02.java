public class Ex02 {
    public static void executar() {
        int tamanho = Prompt.lerInteiro("Digite o tamanho do vetor:");
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o número para a posição " + i + ":");
        }

        for (int i = 0; i < tamanho; i++) {
            int numero = vetor[i];
            String tipoNumero = determinarTipoNumero(numero);

            Prompt.imprimir("Número na posição " + i + ": " + numero + " (" + tipoNumero + ")");
        }
    }

    public static String determinarTipoNumero(int numero) {
        if (numero > 0) {
            return "positivo";
        } else if (numero < 0) {
            return "negativo";
        } else {
            return "zero";
        }
    }

}
