import java.util.Scanner;

public class calc {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    float num1 = scanner.nextFloat();
    System.out.println("Digite o segundo número: ");
    float num2 = scanner.nextFloat();
    System.out.println("Digite a operação desejada (+, -, *, /): ");
    String operacao = scanner.next();

    switch(operacao) {
        case "+":
            System.out.println("O resultado da soma é: " + soma(num1, num2));
            break;
        case "-":
            System.out.println("O resultado da subtração é: " + subtracao(num1, num2));
            break;
        case "*":
            System.out.println("O resultado da multiplicação é: " + multiplicacao(num1, num2));
            break;
        case "/":
            System.out.println("O resultado da divisão é: " + divisao(num1, num2));
            break;
        default:
            System.out.println("Operação inválida");
    }
    

    scanner.close();
}
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero");
            return 0;
        }
        return a / b;
    }
}