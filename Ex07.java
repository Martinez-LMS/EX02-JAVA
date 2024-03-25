public class Ex07 {
    public static void executar() {
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do primeiro vetor:");
        }

        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do segundo vetor:");
        }

        boolean iguais = verificarIgualdade(vetor1, vetor2);

        if (iguais) {
            Prompt.imprimir("Os vetores são iguais.");
        } else {
            Prompt.imprimir("Os vetores são diferentes.");
        }
    }

    public static boolean verificarIgualdade(int[] vetor1, int[] vetor2) {
        if (vetor1.length != vetor2.length) {
            return false;
        }

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] != vetor2[i]) {
                return false;
            }
        }

        return true;
    }
}
