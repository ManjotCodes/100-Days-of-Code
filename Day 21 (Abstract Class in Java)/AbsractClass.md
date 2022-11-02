# Abstract Class in Java

A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.

Points to Remember
An abstract class must be declared with an abstract keyword.

1. It can have abstract and non-abstract methods.

2. It cannot be instantiated.

3. It can have constructors and static methods also.

4. It can have final methods which will force the subclass not to change the body of the method.

### Understanding the real scenario of Abstract class

In this example, Shape is the abstract class, and its implementation is provided by the Rectangle and Circle classes.

Mostly, we don't know about the implementation class (which is hidden to the end user), and an object of the implementation class is provided by the factory method.

A factory method is a method that returns the instance of the class. We will learn about the factory method later.

