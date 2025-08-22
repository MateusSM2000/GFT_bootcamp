import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seu peso [kg]: ");
        float peso = scanner.nextFloat();
        System.out.print("Sua altura [m]: ");
        float altura = scanner.nextFloat();
        float imc = peso / (altura * altura);
        System.out.printf("Seu IMC: %s", imc);
        if (imc >= 40) {
            System.out.print("\nObesidade III (Mórbida)");
        } else if (imc >= 35) {
            System.out.print("\nObesidade II (Severa)");
        } else if (imc >= 30) {
            System.out.print("\nObesidade I");
        } else if (imc >= 25) {
            System.out.print("\nLevemente acima do peso");
        } else if (imc > 18.5) {
            System.out.print("\nPeso normal");
        } else {
            System.out.print("\nAbaixo do peso");
        }
    }
}