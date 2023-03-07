class A
{
int add()
{
int a=10,b=6;
int c=a+b;
return c;
}
void add(int x, int y)
{
System.out.println("Addition="+(x+y));
}
void add(int x, double y)
{
double c=x+y;
System.out.println("Addition="+(x+y));
}
}
class polymorphism
{
public static void main(String args[])
{
A obj=new A();
int z=obj.add();
System.out.println("Addition="+z);
obj.add(25,34);
obj.add(12,12.34);
}
}