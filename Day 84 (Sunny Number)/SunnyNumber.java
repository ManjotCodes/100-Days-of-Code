import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int c=0,a;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            a = (i*i)-1;
            if (a==n)
                c = 1;
        }
        if (c==1)
            System.out.println(n+" is a Sunny number");
        else
            System.out.println(n+" is not a sunny number");
    }
}
