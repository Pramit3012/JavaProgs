import java.util.Scanner;
class A
{
int a,b;
void input()
{
Scanner pr=new Scanner(System.in);
System.out.println("Enter height and width respectively");
a=pr.nextInt();
b=pr.nextInt();
}
}
class B extends A
{
void Area()
{
System.out.println("The area is= "+(a*b));
}
}
class C extends A
{
int Perimeter()
{
int c;
c=2*(a+b);
return (c);
}
}
class mensuration
{
public static void main(String args[])
{
B aa=new B();
aa.input();
aa.Area();
C bb =new C();
bb.input();
int x=bb.Perimeter();
System.out.println("The perimeter is= "+x);
}
}
