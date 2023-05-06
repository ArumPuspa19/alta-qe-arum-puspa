import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil;
        System.out.print("Input: ");
        bil = input.nextInt();


        if (bil % 2 == 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
            }








