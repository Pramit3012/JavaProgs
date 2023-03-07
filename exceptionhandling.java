class exceptionhandling
{
public static void main(String args[])
{
int a,b,c,x,y;
a=10;
b=5;
c=5;
try
{
x=a/(b-c);
System.out.println("Division="+x);
}
catch(ArithmeticException p)
{
System.out.println("Cannot divide by zero");
}
y=a/(b+c);
System.out.println("Division="+y);
}
}