import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a +ve number : ");
        int n = sc.nextInt();
        System.out.println("Enter a prime number");
        int p = sc.nextInt();
        int c = 0;
        while (n > 0) {
            n = n / p;
            c = c + n;
        }
        System.out.println("Output : "+c);
    }
}
