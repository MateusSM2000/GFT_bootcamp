import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = scanner.next();
        System.out.print("Informe seu ano de nascimento: ");
        int ano = scanner.nextInt();
        int anoAtual = OffsetDateTime.now().getYear();
        System.out.printf("Olá %s, você tem %s anos.\n\n", nome, anoAtual - ano);

        //2
        System.out.print("Tamanho do lado do quadrado: ");
        float lado = scanner.nextFloat();
        System.out.printf("A área do quadrado é: %s\n\n", lado * lado);

        //3
        System.out.print("Altura retângulo: ");
        float altura = scanner.nextFloat();
        System.out.print("Agora seu comprimento: ");
        float comprimento = scanner.nextFloat();
        System.out.printf("Área do retângulo: %s\n\n", altura * comprimento);

        //4
        System.out.print("Idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        System.out.print("Agora a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();
        System.out.printf("A diferença de idade entre elas é de %s anos.", Math.abs(idade1 - idade2));
    }
}
