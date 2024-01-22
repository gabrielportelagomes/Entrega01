import java.util.Scanner;

public class MultiplicaAi {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a tabela de multiplicação: ");
        int numero = scanner.nextInt();

        System.out.println("Tabela de multiplicação por " + numero);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    
    }
}
