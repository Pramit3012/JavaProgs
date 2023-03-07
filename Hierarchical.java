//Hierarchical Inheritance
import java.util.Scanner;
class A
{
int a,b;
void input()
{
Scanner pr=new Scanner(System.in);
System.out.println("Enter two numbers");
a=pr.nextInt();
b=pr.nextInt();
}
}
class B extends A
{
void add()
{
System.out.println("Addition= "+(a+b));
}
}
class C extends A
{
void multiplication()
{
System.out.println("Multiplication= "+(a*b));
}
}
class Hierarchical
{
public static void main(String args[])
{
B aa=new B();
C bb=new C();
aa.input();
aa.add();
bb.input();
bb.multiplication();
}
}
