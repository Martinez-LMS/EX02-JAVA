public class Ex04 {
    public static void executar() {
        int[] vetor = new int[5];
        int n;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o número para a posição " + i + ":");
        }

        n = Prompt.lerInteiro("Digite um número:");

        Prompt.imprimir("Índices dos elementos inferiores a " + n + ":");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < n) {
                Prompt.imprimir(i + " ");
            }
        }
    }

}
