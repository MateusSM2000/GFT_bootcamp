import java.util.Scanner;

public class PadroesDesenvolvimentoConceitos {

    private final static String WELCOME_MESSAGE = "Bem vindo";

    public static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = scanner.next();
        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %s \n", nome, idade);
    }
}
