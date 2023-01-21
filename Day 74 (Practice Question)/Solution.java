import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits reduced up to single-digit: ");
        System.out.println(digitSum(n));
    }
    static int digitSum(int n){
        int sum = 0;
        while(n>0 || sum>9){
            if(n==0){
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n/=10;
        }
        return sum;
    }
}
