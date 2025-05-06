import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int soma = 0;

        System.out.println("Digite 12 numeros inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        double media = (double) soma / numeros.length;

        int acimaDaMedia = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                acimaDaMedia++;
            }
        }

        System.out.printf("\nMédia dos valores: %.2f\n", media);
        System.out.println("Quantidade de números acima da média: " + acimaDaMedia);

        scanner.close();
    }
}