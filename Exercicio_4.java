import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
        Integer num1, num2;
        System.out.println("Digite o 1° numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite o 2° numero: ");
        num2 = sc.nextInt();

        System.out.println("A soma é: "+ (num1+num2));
    } catch (InputMismatchException e) {
        System.out.println("Erro: Invalid Input");
    }
    }
}
