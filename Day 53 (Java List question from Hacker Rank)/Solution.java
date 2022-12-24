import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(sc.nextInt());
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++) {
            String input = sc.next();
            if (input.equals("Insert")){
                int x=sc.nextInt();
                int y=sc.nextInt();
                li.add(x,y);
            }
            else{
                li.remove(sc.nextInt());
            }
        }
        for(int i:li){
            System.out.print(i+" ");
        }        
    }
}
