public class Ex01 {
    public static void executar() {
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Prompt.lerInteiro("Digite o número " + (i + 1) + ":");
        }

        double media = calcularMedia(numeros);

        Prompt.imprimir("A média dos números é: " + formatarMedia(media));

        exibirValores(numeros, media);
    }

    public static double calcularMedia(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return (double) soma / numeros.length;
    }

    public static void exibirValores(int[] numeros, double media) {
        Prompt.imprimir("Valores menores que a média:");
        for (int numero : numeros) {
            if (numero < media) {
                Prompt.imprimir(numero + " ");
            }
        }

        Prompt.imprimir("\nValores iguais à média:");
        for (int numero : numeros) {
            if (numero == media) {
                Prompt.imprimir(numero + " ");
            }
        }

        Prompt.imprimir("\nValores superiores à média:");
        for (int numero : numeros) {
            if (numero > media) {
                Prompt.imprimir(numero + " ");
            }
        }
    }

    public static String formatarMedia(double media) {
        return String.format("%.2f", media);
    }
}
