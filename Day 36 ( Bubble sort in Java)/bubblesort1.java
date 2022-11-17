import java.util.*;
public class bubblesort1{
public static void main(String[] args) {
     int i=0;
     int arr[]={9, -4,  5,  8,-3,  7, 0,  4,  1,  2};
     for(i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(" " + arr[k]);
        }
        System.out.println();
    }
}
