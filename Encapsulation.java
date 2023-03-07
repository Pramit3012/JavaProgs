import java.util.Scanner;
class A
{
private int value;//data hiding
public void setvalue(int x)
{
value=x;
}
public int getdata()
{
return value;
}
}
class Encapsulation
{
public static void main(String args[])
{
A obj=new A();
int a;
Scanner pr=new Scanner(System.in);
System.out.println("Enter a number");
a=pr.nextInt();
obj.setvalue(a);
int b;
b=obj.getdata();
System.out.println(b);
}
}
