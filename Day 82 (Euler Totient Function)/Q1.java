import java.util.Scanner;

public class Q1 {
    static int gcd(int a, int b){
        if (a==0){
            return b;
        }
        return gcd(b%a, a);
    }

    public static void main(String[] args) {
        int count = 0;
        int b = 156;
        for (int a=1; a<b; a++){
            if(gcd(a,b)==1){
                count++;
                System.out.println("("+a+","+b+")");
            }
        }
        System.out.println(count);
    }
}