import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetorOriginal = new int[10];

       
        System.out.println("Digite 10 numeros inteiros:");
        for (int i = 0; i < vetorOriginal.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vetorOriginal[i] = scanner.nextInt();
        }

       
        System.out.print("\nDigite o numero que deseja remover: ");
        int numeroParaRemover = scanner.nextInt();

        
        int[] vetorResultado = new int[vetorOriginal.length - 1];
        boolean removido = false;
        int j = 0;

        for (int i = 0; i < vetorOriginal.length; i++) {
            if (!removido && vetorOriginal[i] == numeroParaRemover) {
                removido = true; 
                continue;
            }

            if (j < vetorResultado.length) {
                vetorResultado[j] = vetorOriginal[i];
                j++;
            }
        }

        if (!removido) {
            System.out.println("\nO numero não foi encontrado no vetor.");
        } else {
         
            System.out.println("\nVetor após remover a primeira ocorrência de " + numeroParaRemover + ":");
            for (int i = 0; i < vetorResultado.length; i++) {
                System.out.print(vetorResultado[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}