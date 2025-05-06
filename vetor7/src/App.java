import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];

    
        System.out.println("Digite 15 numeros inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("\nDigite um numero para contar quantas vezes ele aparece: ");
        int numeroBuscado = scanner.nextInt();

   
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroBuscado) {
                contador++;
            }
        }

        System.out.println("\nO numero " + numeroBuscado + " aparece " + contador + " vez(es) no vetor.");

        scanner.close();
    }
}
