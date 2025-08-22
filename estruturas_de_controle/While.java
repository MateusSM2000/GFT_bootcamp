import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float total = 0;
        float numero = 1;
        while (numero != 0) {
            System.out.print("Insira um número [0 para sair]: ");
            numero = scanner.nextFloat();
            total += numero;
            System.out.printf("Total: %s\n", total);
        }

        int numero2 = 1;
        while (true) {
            System.out.print("Insira 0 para sair do loop: ");
            numero2 = scanner.nextInt();
            if (numero2 == 0) {
                break;
            }
        }

        int numero3 = 1;
        do {
            System.out.print("Insira 0 para sair do loop 2: ");
            numero3 = scanner.nextInt();
            if (numero3 == 0) {
                break;
            }
        } while (true);  //do while sempre vai executar pelo menos uma vez: ele começa executando e dps verifica a condição pra ver se executa novamente
    }
}
