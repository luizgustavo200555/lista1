import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero");
        number = in.nextInt();
        result = Math.pow(number,2);
        System.out.println("A quinta parte do numero digitado" + result );



    }
}