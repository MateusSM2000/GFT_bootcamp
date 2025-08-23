import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n========================CÁLCULO DE SALÁRIO========================");
            System.out.print("Insira o salário bruto [0 - sair]: ");
            float salarioBruto = scanner.nextFloat();
            if (salarioBruto == 0) {
                break;
            }
            System.out.print("Insira o adicional de benefícios: ");
            float adicionalBeneficios = scanner.nextFloat();

            float percentualImposto = 0;
            if (salarioBruto > 2500) {
                percentualImposto = 0.15f;
            } else if (salarioBruto > 1100) {
                percentualImposto = 0.1f;
            } else if (salarioBruto >= 0) {
                percentualImposto = 0.05f;
            } else {
                System.out.println("Algum valor inserido incorretamente. Tente novamente.");
                continue;
            }

            float salarioLiquido = salarioBruto * (1 - percentualImposto) + adicionalBeneficios;

            System.out.printf("\nImposto sobre salário bruto: %.2f%%", percentualImposto * 100);
            System.out.printf("\nSalário líquido: R$%.2f", salarioLiquido);

        }
    }
}
