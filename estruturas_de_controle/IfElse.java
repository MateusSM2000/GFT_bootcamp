import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("\nVocê é americano [s/n]? ");
        var usaCitizen = scanner.next().equalsIgnoreCase("s");
        if (idade >= 18) {
            System.out.print("Você pode dirigir");
        } else if (idade >= 16 && usaCitizen) {
            System.out.print("Você pode dirigir por ser cidadão americano");
        } else {
            System.out.print("Você não pode dirigir");
        }
    }
}
