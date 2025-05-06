import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[6];
        int[] B = new int[6];
        int[] C = new int[6]; 
        int contador = 0; 

        System.out.println("Digite 6 numeros para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

       
        System.out.println("\nDigite 6 numeros para o vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < A.length; i++) {
        for (int j = 0; j < B.length; j++) {
            if (A[i] == B[j]) {
                   
                    boolean existe = false;
            for (int k = 0; k < contador; k++) {
                if (C[k] == A[i]) {
                            existe = true;
                            break;
                        }
                    }
                    if (!existe) {
                        C[contador] = A[i];
                        contador++;
                    }
                }
            }
        }

      
        System.out.println("\nElementos comuns aos vetores A e B:");
        for (int i = 0; i < contador; i++) {
            System.out.print(C[i] + " ");
        }

        System.out.println();
        scanner.close();
    }
}