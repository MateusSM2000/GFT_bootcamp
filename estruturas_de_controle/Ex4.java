import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o número inicial: ");
        float ni = scanner.nextFloat();
        while (true) {
            System.out.print("Até q n % n inicial != 0 vai ficar em loop. Insira n: ");
            float n = scanner.nextFloat();
            if (n < ni) {
                continue;
            }
            if (n % ni != 0) {
                break;
            }
        }
    }
}
