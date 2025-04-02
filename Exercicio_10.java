import java.util.InputMismatchException;
import java.util.Scanner;



// Exceção personalizada para número negativo
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensagem) {
        super(mensagem);
    }
}

// Exceção personalizada para limite de fatorial excedido
class LimiteFatorialExcedidoException extends Exception {
    public LimiteFatorialExcedidoException(String mensagem) {
        super(mensagem);
    }
}
public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite um número para calcular o fatorial:");
            int numero = scanner.nextInt();
            if (numero < 0) {
                throw new NumeroNegativoException("O número não pode ser negativo.");
            }
            if (numero > 20) {
                throw new LimiteFatorialExcedidoException("Número maior que 20 pode causar estouro de pilha.");
            }
            System.out.println("Fatorial de " + numero + " é: " + calcularFatorial(numero));
        } catch (InputMismatchException e) {
            System.out.println("Erro: Insira um número válido para o fatorial.");
            scanner.next();
        } catch (NumeroNegativoException | LimiteFatorialExcedidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }
}


