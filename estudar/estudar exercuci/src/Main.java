import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Digite um numero inteiro");
        number = scanner.nextInt();
        System.out.println("O dobro do numero digitado" + number*2);

    }
}