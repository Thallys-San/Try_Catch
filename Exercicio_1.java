import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            Integer num1, num2;
            System.out.println("Digite o 1° Numero: ");
            num1 = sc.nextInt();
            System.out.println("Digite o 2° Numero: ");
            num2 = sc.nextInt();

            System.out.println("A divisão é: "+ num1/num2);

        } catch (ArithmeticException e) {
            System.out.println("Error: Invalid number");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input");
        } finally {
            sc.close();
        }
    }



}
