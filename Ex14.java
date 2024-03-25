import java.util.Arrays;
import java.util.Scanner;

public class Ex14 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor: ");
            vetor[i] = scanner.nextInt();
        }

        int indiceMaiorElemento = encontrarIndiceMaiorElemento(vetor);

        trocarMaiorElementoUltimaPosicao(vetor, indiceMaiorElemento);

        System.out.println("Vetor atualizado com o maior elemento na última posição:");
        System.out.println(Arrays.toString(vetor));

        scanner.close();
    }

    public static int encontrarIndiceMaiorElemento(int[] vetor) {
        int indiceMaiorElemento = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[indiceMaiorElemento]) {
                indiceMaiorElemento = i;
            }
        }
        return indiceMaiorElemento;
    }

    public static void trocarMaiorElementoUltimaPosicao(int[] vetor, int indiceMaiorElemento) {
        int temp = vetor[indiceMaiorElemento];
        vetor[indiceMaiorElemento] = vetor[vetor.length - 1];
        vetor[vetor.length - 1] = temp;
    }
}
