public class Ex05 {
    public static void executar() {
        int[] vetor = new int[5];
        int n;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o número para a posição " + i + ":");
        }

        n = Prompt.lerInteiro("Digite um número:");

        int contagem = contarNumero(vetor, n);

        Prompt.imprimir("O número " + n + " aparece " + contagem + " vezes no vetor.");
    }

    public static int contarNumero(int[] vetor, int n) {
        int contagem = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == n) {
                contagem++;
            }
        }
        return contagem;
    }

}
