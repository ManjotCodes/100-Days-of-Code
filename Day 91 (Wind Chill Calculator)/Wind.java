import java.util.*;
import java.lang.Math;
public class Day_67_Wind{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature value-");
        int temp=sc.nextInt();
        System.out.println("Enter Wind Velocity value-");
        int windV=sc.nextInt();
        double wcf;
        System.out.println("Wind Chill Factor is- ");
        wcf=(35.74 + (0.6215*temp)+(((0.4275*temp)-35.75)* (Math.pow(windV, 0.16))));
        System.out.format("%.4f",wcf);
        sc.close();
    }
}
