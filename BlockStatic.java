//Static block-Static block is such kind of block in java which gets executed at the time of loading a the class file into jvm memory.
class A
{
int a,b;
static
{
System.out.println("Hello World");
}
int add()
{
a=10;
b=20;
int c;
c=a+b;
return c;
}
}
class BlockStatic
{
public static void main(String args[])
{
A obj=new A();
System.out.println(obj.add());
}
}

