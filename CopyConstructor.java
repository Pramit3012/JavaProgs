//Copy constructor- Whenever we pass object reference to the constructor then it is called copy constructor.
class A
{
int a; String b;
A()
{
a=10; b="hagunaka";
System.out.println(a+" "+b);
}
A(A ref)//Copying from the default  constructor
{
a=ref.a;//Copying
b=ref.b;//Copying
System.out.println(a+" "+b);
}
}
class CopyConstructor
{
public static void main(String args[])
{
A obj=new A();
A obj1=new A(obj);//Taking reference from the previous object
}
}