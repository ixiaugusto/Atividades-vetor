public class App {
    
  
    public static void main(String[] args) throws Exception  { 
        
       

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        int quantidadePares = 0;

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 == 0) {
                quantidadePares++;
            }
        }
        System.out.println("\nQuantidade de números pares: " + quantidadePares);

        scanner.close();
    }
}