//Instance block- Instance block is similar to method which has no name, it can be written inside a class only but not inside a method.
/*Points--i)It always executed before the constructor.
ii)We can use variable only inside the instance block not method.
iii)We write time consuming code inside a instance block like-JDBC Connectivity.*/
class A
{
int a,b;
A()
{
a=10;
b=20;
System.out.println(a+" "+b);
}
{
a=20;
b=30;
System.out.println(a+" "+b);
}
}
class InstanceBlock
{
public static void main(String args[])
{
A obj=new A();
}
}
