class A 
{
final void display()
{
System.out.println("This is base class");
}
}
class B extends A
{
void showdata()
{
System.out.println("This is derived class");
}
}
class finalmeth
{
public static void main(String args[])
{
B obj1=new B();
obj1.display();
}
}
