import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int n = scanner.nextInt();
        int nmax = n;
        int nmin = n;
        System.out.print("Insira outro número: ");
        n = scanner.nextInt();

        if (n > nmax) {
            nmax = n;
        } else {
            nmin = n;
        }

        var opcao = "";
        while (true) {
            System.out.print("Mostrar números pares ou ímpares entre os números inseridos [p/i]? ");
            opcao = scanner.next();
            if (!opcao.equalsIgnoreCase("p") && !opcao.equalsIgnoreCase("i")) {
                System.out.println("Escolha par ou ímpar");
                continue;
            }
            break;
        }

        for (int i = nmax; i <= nmax && i >= nmin; i--) {
            if (i % 2 == 0 && opcao.equalsIgnoreCase("p")) {
                System.out.println(i);
            }
            if (i % 2 != 0 && opcao.equalsIgnoreCase("i")) {
                System.out.println(i);
            }
        }
    }
}
