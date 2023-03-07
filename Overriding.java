import java.util.Scanner;
class A
{
void message()
{
System.out.println("Welcome to base class");
}
}
class B extends A
{
void message()
{
System.out.println("This is derived class");
}
}
class Overriding
{
public static void main(String args[])
{
B aa=new B();
aa.message();
}
}