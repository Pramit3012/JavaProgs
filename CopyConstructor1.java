class A
{
int a; int c;
A(int x, int y)
{
a=x;
c=y;
System.out.println(a+c);
}
A(A ref)
{
a=a.ref;
c=c.ref;
System.out.println(a+c);
}
}
class CopyConstructor1
{
public static void main(String args[])
{
A obj1=new A(1,2);
A obj2=new A(obj1);
}
}
