import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    BitSet b1 = new BitSet(n);
    BitSet b2 = new BitSet(n);
    BitSet[] bs = new BitSet[3];

    bs[1] = b1; 
    bs[2] = b2;

    for (int i = 0; i < m; i++){
        String op = sc.next();
        int x = sc.nextInt();
        int y = sc.nextInt();

        switch(op){
            case("AND"):
                bs[x].and(bs[y]);
                break;
            case("OR"):
                bs[x].or(bs[y]);
                break;
            case("SET"):
                bs[x].set(y);
                break;
            case("FLIP"):
                bs[x].flip(y);
                break;
            case("XOR"):
                bs[x].xor(bs[y]);
        }
        System.out.println(b1.cardinality() + " " + b2.cardinality());
    }

  }
                        
}       
    
