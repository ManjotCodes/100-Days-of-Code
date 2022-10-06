import java.util.*;
//print subarrays
public class printsubarrays{
    public static void subarray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                for(int k=start;k<=end;k++){ //print
                    System.out.print(numbers[k]+" "); //subarray
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subarray(numbers);
    }    
}