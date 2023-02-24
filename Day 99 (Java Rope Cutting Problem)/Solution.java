import java.util.*;
public class Solution {
    static int maxpiece(int n, int a, int b, int c){
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        
        int res=Math.max(maxpiece(n-a,a,b,c),Math.max(maxpiece(n-b,a,b,c),maxpiece(n-c,a,b,c)));
        
        if (res == -1) return -1;
        return res + 1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total Length of Rope");
        int n=sc.nextInt();
        System.out.println("Enter 3 Lengths of pieces in which rope can be cut");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        System.out.println("Number of pieces: "+maxpiece(n,a,b,c));
    }
}
