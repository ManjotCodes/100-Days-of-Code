import java.util.*;
public class functions {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }   
    
    public static int calculateSum(int num1, int num2) { //parameters or formal parameters
        int sum = num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b); //arguments or actual parameters
        System.out.println("sum is : " +sum);
    }
}

//Factorial using functions

import java.util.*;
public class factorialusingfunctions {
    public static int factorial(int num){
        int f=1; //value 1 initialize kri taaki hm uski value ko loose na kre 

        for(int i=1;i<=num;i++) {
            f =  f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(factorial(7));                              
    }
}

//Methods in java

import java.util.*;
public class Sum {
    public static void main(String[] args) {
        //int answer = sum2();
        //System.out.println(answer);
        int answer= sum3(20,30);
        System.out.println(answer);
    }
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }
    static int sum2() {
        Scanner hj = new Scanner(System.in);
        System.out.println("Enter the first number =");
        int num1 = hj.nextInt();
        System.out.println("Enter the second number =");
        int num2 = hj.nextInt();
        int sum = num1+num2;
        return sum;
    }
    static void sum() {
        Scanner hj = new Scanner(System.in);
        System.out.println("Enter the first number =");
        int num1 = hj.nextInt();
        System.out.println("Enter the second number =");
        int num2 = hj.nextInt();
        int sum = num1+num2;
        System.out.println("The sum = "+sum);
    }

}
