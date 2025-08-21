import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("var i = 0; i <= 10; i++");
        for (var i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 10) {
                System.out.println();
            }
        }

        System.out.println("var i = 0; i <= 10; i+=2");
        for (var i = 0; i <=10; i+=2) {
            System.out.println(i);
            if (i == 10) {
                System.out.println();
            }
        }

        System.out.println("var i = 10; i >= 0; i-=2");
        for (var i = 10; i >=0; i-=2) {
            System.out.println(i);
            if (i == 0) {
                System.out.println();
            }
        }

        System.out.println("var i = 10; i >=0; i--  if (i % 2 == 0) { continue; }");
        for (var i = 10; i >=0; i--) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
            if (i == 1) {
                System.out.println();
            }
        }

        float total = 0;
        for (;;) {
            System.out.print("Digite um número para somar [0 para sair]: ");
            float numero = scanner.nextFloat();
            total += numero;
            System.out.printf("Total: %s\n", total);
            if (numero == 0) {
                break;
            }
        }
    }
}
