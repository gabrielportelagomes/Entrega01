import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da sequência de Fibonacci: ");
        int tamanho = scanner.nextInt();

        for (int i = 0; i < tamanho; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
