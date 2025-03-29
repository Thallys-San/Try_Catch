import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite três notas:");
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();
            double nota3 = scanner.nextDouble();
            double media = (nota1 + nota2 + nota3) / 3;
            System.out.println("Média: " + media);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Você deve inserir números válidos.");
            scanner.next();
        }
    }
}
