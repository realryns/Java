import java.util.Locale;
import java.util.Scanner;

public class fixacao_2 {
        public static void  main(String[] args) {

            System.out.print("Digite um número: ");

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            double x;
            x = sc.nextDouble();

            System.out.printf("Você digitou: %.1f", x);
            sc.close();
        }

}