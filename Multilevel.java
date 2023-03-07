//Multilevel Inheritance
import java.util.Scanner;
class A
{
int a;
void input()
{
Scanner pr=new Scanner(System.in);
System.out.println("Enter any number");
a=pr.nextInt();
}
}
class B extends A
{
int b;
void getdata()
{
Scanner tf=new Scanner(System.in);
System.out.println("Enter another number");
b=tf.nextInt();
}
}
class C extends B
{
void addition()
{
System.out.println("Addition= "+(a+b));
}
}
class Multilevel
{
public static void main(String args[])
{
C aa=new C();
System.out.println("This is an example of multilevel inheritance");
aa.input();
aa.getdata();
aa.addition();
}
}

