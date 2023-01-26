import java.util.Scanner;
public class sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] array = new boolean[n+1];
        for(int i=2; i<n; i++){
            array[i] = true;
        } 
        for(int i=2; i*i<n; i++){
            if(array[i]==true){
                for(int j=i*i; j<n; j+=i){
                    array[j]=false;
                }
            }
        }
        for(int i=2; i<n; i++){
            if(array[i] == true){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
