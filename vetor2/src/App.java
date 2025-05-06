import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];

       
        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("numero " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

       
        int maior = vetor[0];
        int indiceMaior = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                indiceMaior = i;
            }
        }

      
        System.out.println("\nMaior valor: " + maior);
        System.out.println("Posição (índice): " + indiceMaior);

        scanner.close();
    }
}
