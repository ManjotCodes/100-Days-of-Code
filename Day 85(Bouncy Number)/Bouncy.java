import java.util.Scanner;
public class Bouncy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int p,a=0,b=0,d,sd;
        p = n;
        if (n<100){
            System.out.println(p+" is not a Bouncy number"); }
        else {
            while (n>0){
                d = n%10;
                sd = (n%100)/10;
                n=n/10;
                if (d>sd && b==0) {
                    a = 1;
                    continue; }
                else if (d<sd && a==0){
                    b=1;
                    continue;
                }else {
                    b=2;
                    break; } }
            if (b==2)
                System.out.println(p+" is a Bouncy Number");
            else System.out.println(p+" is not a Bouncy Number"); } }}



