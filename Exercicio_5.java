import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] text = new String[3];
            System.out.println("Digite Frases: ");
            for (int i=0;i<3;i++){
                System.out.println("Digite a frase numero °"+i+": ");
                text[i] = sc.next();
            }
            System.out.println("Digite a posição que deseja ser puxada: ");
            int posicao = sc.nextInt();

            System.out.println("A posição é igual a: "+text[posicao]);

        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Invalid Array Position");
        }
    }
}
