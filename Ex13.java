public class Ex13 {
    public static void executar() {
        int n = Prompt.lerInteiro("Digite o número de termos da sequência de Fibonacci:");

        if (n <= 0) {
            Prompt.imprimir("Número inválido. Digite um número positivo.");
            return;
        }

        int[] fibonacci = gerarSequenciaFibonacci(n);

        Prompt.imprimir("Os " + n + " primeiros termos da sequência de Fibonacci:");
        for (int i = 0; i < n; i++) {
            Prompt.imprimir("Termo " + (i + 1) + ": " + fibonacci[i]);
        }
    }

    public static int[] gerarSequenciaFibonacci(int n) {
        int[] fibonacci = new int[n];

        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}
