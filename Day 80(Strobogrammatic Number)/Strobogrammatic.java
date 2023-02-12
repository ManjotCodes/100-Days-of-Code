import  java.util.Scanner;
public class Strobogrammatic {
    static char rotate(char ch){
        switch (ch){
            case '6' : return '9';
            case '9' : return '6';
            default : return ch;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        String s2 = new String();
        String temp = new String();
        if(s.length()==1){
            if (s.contains("0") || s.contains("1") || s.contains("8")){
                System.out.println("Strobo");
            }
            else{
                System.out.println("Not Strobo");
            }
        }
        else {
            if (s.contains("2") || s.contains("3") || s.contains("4") || s.contains("5") || s.contains("7")){
                System.out.println("Not Strobo");
            }
            else{
                StringBuffer s1 = new StringBuffer(s);
                s1.reverse();
                s2 = s1.toString();

                for(int i=0; i<s2.length(); i++){
                    temp += rotate(s2.charAt(i));
                }
                if (s.equals(temp)){
                    System.out.println("Strobo");
                }
                else {
                    System.out.println("Not Strobo");
                }
            }
        }
    }
}
