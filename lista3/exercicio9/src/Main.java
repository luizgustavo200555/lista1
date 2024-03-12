import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1= scanner.nextInt();



        for (int i = n1; i > 1; i--)

            if ( n1 % i > 0) {
                System.out.println("seu número digitado  não é primo");

                break;
            }

            else {
                System.out.println("seu número é primo");
                break;
            }

    }
}