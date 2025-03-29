import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();
            if (idade < 0) {
                throw new IdadeInvalidaException("Idade não pode ser negativa.");
            }
            System.out.println(idade >= 18 ? "Você é maior de idade." : "Você é menor de idade.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Insira um número válido para a idade.");
            scanner.next();
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
