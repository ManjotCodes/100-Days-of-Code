import java.util.*;
public class Smith
{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int a = findSumOfDigit(n);
        int b = findSumPrimeFactors(n);
        if(a==b)
            System.out.print("\n"+n+" is a Smith number\n");
        else
            System.out.print("\n"+n+" is not a Smith number\n"); }
    static int findSumPrimeFactors(int n) {
        int i=2, sum=0;
        while(n>1) {
            if(n%i==0) {
                sum=sum+findSumOfDigit(i);
                n=n/i; }
            else {
                do {
                    i++; }
                while(!isPrime(i)); } }
        return sum; }
    static int findSumOfDigit(int n) {
        int s=0;
        while(n>0) {
            s=s+n%10;
            n=n/10; }
        return s; }
    static boolean isPrime(int k) {
        boolean b=true;
        int d=2;
        while(d<Math.sqrt(k)) {
            if(k%d==0) {
                b=false; }
            d++; }
        return b; }
}
