public class Ex12 {
    public static void executar() {
        int[] vetor = new int[12];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor:");
        }

        int produto = calcularProdutoElementosParesPositivos(vetor);

        Prompt.imprimir("O produto dos elementos pares positivos é: " + produto);
    }

    public static int calcularProdutoElementosParesPositivos(int[] vetor) {
        int produto = 1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0 && vetor[i] % 2 == 0) {
                produto *= vetor[i];
            }
        }

        return produto;
    }
}
