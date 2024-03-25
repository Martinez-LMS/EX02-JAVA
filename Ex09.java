public class Ex09 {
    public static void executar() {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor A:");
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor B:");
        }

        for (int i = 0; i < vetorC.length; i++) {
            if (i % 2 == 0) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[i];
            }
        }

        Prompt.imprimir("Vetor C gerado:");
        for (int i = 0; i < vetorC.length; i++) {
            Prompt.imprimir("Posição " + i + ": " + vetorC[i]);
        }
    }
}
