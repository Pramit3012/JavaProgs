final class A
{
void display()
{
System.out.println("Base class");
}
}
class B
{
void showdata()
{
System.out.println("Derived class");
}
}
class finalclas
{
public static void main(String args[])
{
B obj=new B();
A obj1=new A();
obj1.display();
obj.showdata();
}
}