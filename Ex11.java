public class Ex11 {
    public static void executar() {
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do primeiro vetor:");
        }

        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do segundo vetor:");
        }

        int produtoEscalar = calcularProdutoEscalar(vetor1, vetor2);

        Prompt.imprimir("O produto escalar entre os vetores é: " + produtoEscalar);
    }

    public static int calcularProdutoEscalar(int[] vetor1, int[] vetor2) {
        int produtoEscalar = 0;

        for (int i = 0; i < vetor1.length; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }

        return produtoEscalar;
    }
}
