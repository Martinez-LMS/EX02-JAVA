public class Ex06 {
    public static void executar() {
        double[] notas = new double[5];
        double[] pesos = new double[5];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Prompt.lerDecimal("Digite a nota " + (i + 1) + " do aluno:");
        }

        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = Prompt.lerDecimal("Digite o peso correspondente à nota " + (i + 1) + ":");
        }

        double mediaPonderada = calcularMediaPonderada(notas, pesos);

        Prompt.imprimir("A média ponderada do aluno é: " + formatarMedia(mediaPonderada));
    }

    public static double calcularMediaPonderada(double[] notas, double[] pesos) {
        double somaNotas = 0;
        double somaPesos = 0;

        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        return somaNotas / somaPesos;
    }

    public static String formatarMedia(double media) {
        return String.format("%.2f", media);
    }
}
