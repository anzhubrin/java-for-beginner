import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner num = new Scanner(System.in);
        int first;
        System.out.print("Enter first num: ");
        first = num.nextInt();

        if (first == 10) {
            System.out.print("Num is 10");
            System.out.print("/n");
        } else {
            System.out.print("Num not 10");
        }



        /* 6 Занятие
        Scanner num = new Scanner(System.in);

        int first, second, result;
        System.out.print("Enter first num: ");
        first = num.nextInt();
        System.out.print("Enter second num: ");
        second = num.nextInt();

        result = first + second;
        System.out.print("Summa is: " + result); */

    }
}
