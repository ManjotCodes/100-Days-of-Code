
# Method overloading


In Java, two or more methods may have the same name if they differ in parameters (different number of parameters, different types of parameters, or both). These methods are called overloaded methods and this feature is called method overloading.


Advantages


Method overloading improves the Readability and reusability of the program.

Method overloading reduces the complexity of the program.

Using method overloading, programmers can perform a task efficiently and effectively.

Using method overloading, it is possible to access methods performing related functions with slightly different arguments and types.

Objects of a class can also be initialized in different ways using the constructors.

Example-  

class Adder{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11));  
}}  




## 🚀 About Me
My name is Manjot Singh
and
I'm a front end developer...


## 🛠 Skills
Javascript, Java, HTML, CSS...

