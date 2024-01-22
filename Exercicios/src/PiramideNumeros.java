import java.util.Scanner;

public class PiramideNumeros {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas para a pirâmide: ");
        int numeroLinhas = scanner.nextInt();

        for (int i = 1; i <= numeroLinhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        scanner.close();
    }
}
