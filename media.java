import java.util.Scanner;

class media {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o seu nome: ");
    String nome = scanner.nextLine();

    System.out.println("Digite a sua primeira nota: ");
    float nota1 = scanner.nextFloat();
    System.out.println("Digite a sua segunda nota: ");
    float nota2 = scanner.nextFloat();
    System.out.println("Digite a sua terceira nota: ");
    float nota3 = scanner.nextFloat();

    while (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
      System.out.println("Erro, faça novamente");
      System.out.println("Digite a sua primeira nota: ");
      nota1 = scanner.nextFloat();
      System.out.println("Digite a sua segunda nota: ");
      nota2 = scanner.nextFloat();
      System.out.println("Digite a sua terceira nota: ");
      nota3 = scanner.nextFloat();
    }

    float media = (nota1 + nota2 + nota3) / 3;

    System.out.println(nome + " sua média é: " + media);

    if (media >= 7) {
      System.out.println("Aprovado");
    } else if (media >= 5 && media < 7) {
      System.out.println("Recuperação");
    } else {
      System.out.println("Reprovado");
    }

    scanner.close();

  }
}