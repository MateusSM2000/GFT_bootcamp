import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n%s * %s = %s", numero, i, numero * i);
        }
    }
}
