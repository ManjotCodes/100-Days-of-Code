import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int p,dig,s=0;
        p = n;
        while (p>0){
            dig = p % 10;
            s = s+(dig*dig);
            p = p/10;
        }
        System.out.println("Norm of "+n+" is "+Math.sqrt(s));
    }
}

