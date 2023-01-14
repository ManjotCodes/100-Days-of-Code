import java.util.Scanner;
public class Solution {
        public static char ch;
        public static String Rev="";

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String S = sc.nextLine();
            System.out.println(palindrome(S));
        }
        public static String palindrome(String S){

            for(int i=0;i<S.length();i++){
                ch=S.charAt(i);
                Rev=ch+Rev;
            }
            if(S.equals(Rev)){
                return "Yes";
            }
            return "No";
        }
}
