import java.util.Scanner;

public class Solution{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Days :");
        int numDays = sc.nextInt();
        int [] temp = new int [numDays];
        int sum=0;
        for(int i =0 ; i<temp.length;i++){
            System.out.println("Day "+(i+1)+"'s Temperature");
            temp[i]= sc.nextInt();
            sum += temp[i];
        }
        int Average = sum/numDays;
        System.out.println("Average temperature is :"+Average);
        int above=0;
        for(int i=0; i<temp.length;i++){
            if(temp[i]>Average){
                above++;
            }
        }
        System.out.println("Days having temperature above average :"+above);
    }
}
