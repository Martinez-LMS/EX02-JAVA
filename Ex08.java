public class Ex08 {
    public static void executar() {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor A:");
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor B:");
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }
        for (int i = 0; i < vetorB.length; i++) {
            vetorC[i + vetorA.length] = vetorB[i];
        }

        Prompt.imprimir("Vetor C (concatenação de A e B):");
        for (int i = 0; i < vetorC.length; i++) {
            Prompt.imprimir("Posição " + i + ": " + vetorC[i]);
        }
    }
}
