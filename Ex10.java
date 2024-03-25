public class Ex10 {
    public static void executar() {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor A:");
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[vetorA.length - 1 - i];
        }

        Prompt.imprimir("Vetor B (cópia invertida de A):");
        for (int i = 0; i < vetorB.length; i++) {
            Prompt.imprimir("Posição " + i + ": " + vetorB[i]);
        }
    }
}
