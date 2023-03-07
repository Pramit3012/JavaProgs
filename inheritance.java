import java.util.Scanner;
class A
{
int a,b,c;
void input()
{
Scanner pr=new Scanner(System.in);
System.out.println("Enter two numbers");
a=pr.nextInt();
b=pr.nextInt();
}
void add()
{
c=a+b;
System.out.println("Addition = "+c);
}
}
class B extends A
{
int d;
void getdata()
{
Scanner tf=new Scanner(System.in);
System.out.println("Enter another number");
d=tf.nextInt();
}
void display()
{
int e;
e=a+b+d;
System.out.println("Addition= "+e);
}
}
class inheritance
{
public static void main(String args[])
{
B aa=new B();
aa.input();
aa.getdata();
aa.add();
aa.display();
}
}