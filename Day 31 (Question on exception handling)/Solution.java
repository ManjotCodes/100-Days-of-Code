import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
         int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            System.out.println(a/b);

        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
    }
    catch(InputMismatchException e){
        System.out.println("java.util.InputMismatchException");
    }
  }
}
