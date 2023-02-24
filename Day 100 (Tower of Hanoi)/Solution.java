import java.util.*;
public class Solution {
    static void MJ(int n, char A, char B,char C){
        if(n==1){
            System.out.println("Move "+n+" from "+A+" to "+C);
            return;
        }
        MJ(n-1, A, C, B);
        System.out.println("Move "+n+" from "+A+" to "+C);
        MJ(n-1, B, A, C);       
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        MJ(n,'A','B','C');
    }
}
