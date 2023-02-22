// Swapping two numbers in a single line without using third variable
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("\nBefore Swapping\nA = "+a+"\nB = "+b);
        b = (a+b)-(a=b);
        System.out.println("\nAfter Swapping\nA = "+a+"\nB = "+b);
    }
}
