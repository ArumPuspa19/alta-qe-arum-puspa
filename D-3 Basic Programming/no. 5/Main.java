import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Input : ");

            String str = scan.nextLine();
            String reverseStr = "";

            for(int i = str.length() - 1; i >= 0; i--){
                reverseStr = reverseStr + str.charAt(i);
            }

            if(str.equals(reverseStr)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
