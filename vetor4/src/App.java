import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
               {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[8];
      
        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nVetor na ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}