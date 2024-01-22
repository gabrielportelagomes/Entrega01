import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicadosNao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os elementos do primeiro array separados por vírgula: ");
        String[] array1 = scanner.nextLine().split(", ");

        System.out.print("Digite os elementos do segundo array separados por vírgula: ");
        String[] array2 = scanner.nextLine().split(", ");

        System.out.println("Elementos em comum:");

        Set<String> set1 = new HashSet<>();
        for (String elemento : array1) {
            set1.add(elemento);
        }

        for (String elemento : array2) {
            if (set1.contains(elemento)) {
                System.out.println(elemento);
            }
        }

        scanner.close();
    }
}
