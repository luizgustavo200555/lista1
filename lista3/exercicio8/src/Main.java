import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        boolean eprimo=true;

        Scanner in = new Scanner(System.in);
        do {

            System.out.println("Digite um numero: ");
            n = in.nextInt();
        }while (n<0);
        for (int i=n/2;i>1;i--) {
            if (n % i == 0)
                eprimo = true;
            break;
        }
        if (eprimo)
            System.out.println("É primo");
        else
            System.out.println("Não é um primo");
    }
}