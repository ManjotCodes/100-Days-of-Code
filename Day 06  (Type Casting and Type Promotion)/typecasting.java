// type casting 
import java.util.*;
public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 25.12f;
        int b = (int) a;
        System.out.println(b);
        char ch = 'a';
        int number = ch;
        System.out.println(number);
        int p = 20;
        float z= (float) p; 
    }
}

// type promotion
import java.util.*;
public class typepromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);
    }
}
 // loops 
 
 public class perfectnolessthan500 {
    public static void main(String[] args) {
        int i, j, sum;
        System.out.println("All Perfect numbers between 1 to 500 :\n");
        for(i=1; i<=500; i++)
    {
        sum = 0;
        for(j=1; j<i; j++)
        {
            if(i % j == 0)
            {
                sum += j;
            }
        }
        if(sum == i)
        System.out.println("Perfect Numbers", i);
    }
    }
}

// next 
public class ms {
    public static void main(String[] args) {
        int sum = 0;
		int num = 100;
		for (int i = 1; i <= num; i++) {
			if (i %5== 0) {
				System.out.println(i + " ");
				sum += i;
			}
		}
		System.out.println("Sum of all these numbers is = " + sum);
	}
}
