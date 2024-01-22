import java.util.Scanner;

public class OQueEEsseNumero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String parOuImpar = (numero % 2 == 0) ? "par" : "ímpar";

        String posOuNegOUZero = (numero > 0) ? "positivo" : (numero < 0) ? "negativo" : "zero";

        System.out.println(numero + " é " + parOuImpar + " e " + posOuNegOUZero + ".");

        scanner.close();
		
	
	}

}
