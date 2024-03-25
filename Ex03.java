public class Ex03 {
    public static void executar() {
        int tamanho = Prompt.lerInteiro("Digite o tamanho do vetor:");
        int[] vetorOriginal = new int[tamanho];
        int[] vetorDobro = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetorOriginal[i] = Prompt.lerInteiro("Digite o número para a posição " + i + ":");
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        Prompt.imprimir("Valores do vetor com o dobro de cada número:");
        for (int i = 0; i < tamanho; i++) {
            Prompt.imprimir("Posição " + i + ": " + vetorDobro[i]);
        }
    }
}
