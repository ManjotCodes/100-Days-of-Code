import java.util.*;
public class Solution {
    public static void main(String[] args)
    {
        int n1 = 10;
        int n2 = 10;

        Integer w1 = new Integer(10);
        Integer w2 = new Integer(10);

        System.out.println(n1 == n2);

        System.out.println(w1 == w2); // Compares reference
        
        System.out.println(w1.equals(w2)); // Compares value of object
    }
}
