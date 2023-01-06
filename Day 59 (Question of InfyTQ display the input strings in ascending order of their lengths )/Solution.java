import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        n=n+1;
        String[] array= new String[n];
        String s;
        for(i=0;i<n;i++){
            array[i]=sc.nextLine();
        }
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                if(array[i].length()>array[j].length()){
                    s=array[i];
                    array[i]=array[j];
                    array[j]=s;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}
