import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite algum numero: ");
            String text = sc.next();
            int number = Integer.parseInt(text);

            System.out.println(number);

        }catch (NumberFormatException e){
            System.out.println("Error: Invalid Input");
        }
    }
}
