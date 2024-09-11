//Não fui eu que fizzz


import java.util.Scanner;

public class contage_letras_chatgpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String input = scanner.nextLine();

        // Array para armazenar a contagem das letras (0-25 para 'a'-'z' e 'A'-'Z')
        int[] contagem = new int[128]; // ASCII tem 128 caracteres possíveis

        // Percorrer a string e contar as letras
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) { // Verifica se é uma letra
                contagem[c]++;
            }
        }

        // Exibir o resultado
        System.out.println("Contagem de letras:");
        for (int i = 0; i < contagem.length; i++) {
            if (contagem[i] > 0 && Character.isLetter(i)) {
                System.out.println((char) i + ": " + contagem[i]);
            }
        }

        scanner.close();
    }
}
