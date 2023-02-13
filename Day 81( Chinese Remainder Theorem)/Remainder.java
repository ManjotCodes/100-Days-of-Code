import java.util.*;
class Remainder{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int num[]=new int[n];
        int rem[]=new int[n];
        System.out.println("Enter divisor = ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter remainder = ");
        for(int i=0;i<n;i++){
            rem[i]=sc.nextInt();
        }
        int x=1;
        while(x>0){
            int i;
            for(i=0;i<n;i++) {
                if (x % num[i] != rem[i]) {
                    break;
                }
            }
            if (i == n) {
                break;
            }
            x++;
        }
        System.out.println("Your value of X is =" +x );
    }
}