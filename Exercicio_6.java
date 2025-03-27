import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Digite um nome: ");
                String nome = sc.nextLine();

                if (nome == null || nome.trim().isEmpty()) {
                    throw new IllegalArgumentException("Nome inválido.");
                }

                System.out.println("Digite uma idade: ");
                int idade = sc.nextInt();
                sc.nextLine();

                if (idade <= 0) {
                    throw new IllegalArgumentException("Idade inválida.");
                }

                System.out.println("O nome é: " + nome);
                System.out.println("A idade é: " + idade);
                break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Número inválido.");
            sc.nextLine();
        }
    }
}
