import java.util.Scanner;

class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println(nome + " tem " + idade + " anos.");



    // String valor="Descomplica - Java";
    // String marcelitos="Descomplica - Java";
    // Number got= 19;
    // Float goat= 8.5f; //f no final para indicar que é float precisamente, e não double
    // double goat2= 8.5567544903039303033939; //double é mais preciso
    // //Resumindo, float é para 2 casas decimais, double é para mais casas, é preferivel usar double, por ser mais rápido e preciso, porém ocupa mais espaço no banco de dados

    // System.out.println(valor.contains("Java"));
    // System.out.println(valor.contains("C#"));
    // System.out.println(valor.length());
    // System.out.println(valor.equals(marcelitos)); // compara se as strings são iguais
    // System.out.println("Olá Mundo!");
    // System.out.println(got);
    // System.out.println(goat);
    // System.out.println(goat2);
    // System.out.println(goat);

        scanner.close();





  }
}