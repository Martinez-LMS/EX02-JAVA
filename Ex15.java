public class Ex15 {
    public static void executar() {
        int[] vetor = new int[5];
        vetor[0] = Prompt.lerInteiro("Digite o primeiro número:");

        for (int i = 1; i < vetor.length; i++) {
            int numero = Prompt.lerInteiro("Digite o próximo número:");
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                Prompt.imprimir("Número inválido. Deve ser maior que o anterior.");
                i--;
            }
        }

        Prompt.imprimir("Vetor preenchido com os números:");
        for (int num : vetor) {
            Prompt.imprimir(num);
        }
        
    }
}
