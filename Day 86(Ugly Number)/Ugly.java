import java.util.Scanner;
public class Ugly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, k = 0;
        while (n != 1) {
            if (n % 2 == 0)
                n = n / 2;
            else if (n % 3 == 0)
                n = n / 3;
            else if (n % 5 == 0)
                n = n / 5;
            else {
                System.out.println(temp + " is not an ugly number");
                k = 1;
                break;
            }}
            if (k == 0)
                System.out.println(temp + " is an ugly number");
    }
}
