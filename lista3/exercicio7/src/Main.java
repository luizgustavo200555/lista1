import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        for (int numero = 1; numero <= 10; numero++)

            for (int i = 1; i <= 10; i++) {

                int resultado =  numero * i;
                System.out.println(  numero + " x " + i + " = " + resultado);
            }


    }
}