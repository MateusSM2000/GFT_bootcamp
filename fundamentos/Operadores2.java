import java.util.Scanner;

public class Operadores2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        var value1 = scanner.nextFloat();
        System.out.print("\nDigite outro numero: ");
        var value2 = scanner.nextFloat();

        System.out.printf("\n%s + %s == %s", value1, value2, value1 + value2);
        System.out.printf("\n%s - %s == %s", value1, value2, value1 - value2);
        System.out.printf("\n%s / %s == %s", value1, value2, value1 / value2);
        System.out.printf("\n%s %% %s == %s", value1, value2, value1 % value2);
        System.out.printf("\n%s * %s == %s", value1, value2, value1 * value2);
        System.out.printf("\n%s elevado a %s == %s", value1, value2, Math.pow(value1, value2));
        System.out.printf("\nraiz quadrada de %s == %s", value1, Math.sqrt(value1));
        value1 += value1;
        System.out.printf("\nvalue1 == %s", value1);
    }
}
