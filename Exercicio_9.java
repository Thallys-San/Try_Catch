import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite a temperatura em Celsius:");
            double celsius = scanner.nextDouble();
            if (celsius < -273.15) {
                throw new TemperaturaInvalidaException("A temperatura não pode ser inferior ao zero absoluto (-273.15°C).");
            }
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Insira um número válido para a temperatura.");
            scanner.next();
        } catch (TemperaturaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
