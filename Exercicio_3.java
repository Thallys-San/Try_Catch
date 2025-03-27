import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer number = 0;

        try {
            System.out.print("DIgite um numero: ");
            number = sc.nextInt();

            if (number < 0) {
                throw new IllegalArgumentException("Error: Negative Number");
            }

            System.out.println("A Raiz quadrada é: " + Math.sqrt(number));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
